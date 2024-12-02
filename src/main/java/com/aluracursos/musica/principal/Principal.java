package com.aluracursos.musica.principal;

import com.aluracursos.musica.model.Artista;
import com.aluracursos.musica.model.Cancion;
import com.aluracursos.musica.model.TipoArtista;
import com.aluracursos.musica.repository.ArtistaRepository;

import java.util.*;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ArtistaRepository repositorio;
    List<Artista> artistas;

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void mostrarMenu() {
        var opcion = -1;

        while (opcion != 0) {
            var menu = """
                
                **** Aplicación de Músicas ****
                
                Elige alguna opción:
                
                1.- Registrar datos de artistas
                2.- Registrar datos de canciones
                3.- Buscar canciones por artistas
                4.- Listar artistas
                5.- Listar canciones
                6 - Buscar canciones por género
                
                0.- Salir
                
                """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    registrarArtistas();
                    break;
                case 2:
                    registrarCanciones();
                    break;
                case 3:
                    buscarCancionesPorArtista();
                    break;
                case 4:
                    mostrarArtistas();
                    break;
                case 5:
                    mostrarCanciones();
                    break;
                case 6:
                    buscarCancionesPorGenero();
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción enlistada.");
            }
        }
    }

    private void registrarArtistas() {
        System.out.println("Por favor, llena los siguientes campos\n");
        System.out.println("Nombre del artista:");
        var nombreCantante = teclado.nextLine();
        System.out.println("Tipo de cantante (solista, duo o banda):");
        var tipo = teclado.nextLine();
        System.out.println("Fecha de nacimiento (año):");
        var fechaNacimiento = teclado.nextInt();
        teclado.nextLine();
        TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());

        Artista artista = new Artista(nombreCantante, tipoArtista, fechaNacimiento);
        repositorio.save(artista);

        System.out.println("Registro del artista exitoso.");
    }

    private void registrarCanciones() {
        System.out.println("Ingresa el nombre del cantante al cual quieres registrar la canción:");
        var nombre = teclado.nextLine();

        Optional<Artista> artistaBuscado = repositorio.findByNombreArtistaContainsIgnoreCase(nombre);

        if (artistaBuscado.isPresent()) {
            System.out.println("Por favor, llena los siguientes campos\n");
            System.out.println("Nombre de la canción:");
            var nombreCancion = teclado.nextLine();
            System.out.println("Nombre de la banda:");
            var banda = teclado.nextLine();
            System.out.println("Nombre del álbum:");
            var album = teclado.nextLine();
            System.out.println("Nombre del género:");
            var genero = teclado.nextLine();
            System.out.println("Año de lanzamiento:");
            var fechaLanzamiento = teclado.nextInt();

            Cancion cancion = new Cancion(nombreCancion, banda, album, genero, fechaLanzamiento);
            cancion.setArtista(artistaBuscado.get());
            artistaBuscado.get().getCanciones().add(cancion);
            repositorio.save(artistaBuscado.get());

            System.out.println("Registro de la canción exitoso.");
        } else {
            System.out.println("No se encontró al artista ingresado.");
        }
    }

    private void buscarCancionesPorArtista() {
        System.out.println("Nombres de los artistas:\n");
        artistas = repositorio.findAll();
        artistas.forEach(c -> System.out.println(c.getNombreArtista() + "\n"));
        System.out.println("Introduce el nombre del artista para buscar las canciones:");
        var nombreCantante = teclado.nextLine();
        List<Cancion> canciones = repositorio.buscarCancionesPorArtista(nombreCantante);
        canciones.forEach(c ->
                System.out.printf(
                        "\nNombre del cantante: %s\nNombre de la canción: %s\nÁlbum: %s\nBanda: %s\nGénero: %s\nFecha de lanzamiento: %d\n",
                        c.getArtista().getNombreArtista(), c.getNombreCancion(), c.getAlbum(), c.getBanda(),
                        c.getGenero(), c.getFechaDeLanzamiento()
                )
        );
    }

    private void mostrarArtistas() {
        artistas = repositorio.findAll();
        artistas.forEach(System.out::println);
    }

    private void mostrarCanciones() {
        artistas = repositorio.findAll();
        artistas.forEach(c -> c.getCanciones().forEach(System.out::println));
    }

    private void buscarCancionesPorGenero() {
        System.out.println("Introduce el nombre de un género:");
        var nombreGenero = teclado.nextLine();
        List<Cancion> cancionesPorGenero = repositorio.buscarCancionesPorGenero(nombreGenero);
        System.out.println("Las canciones del género " + nombreGenero + " son:");
        cancionesPorGenero.forEach(System.out::println);
    }
}
