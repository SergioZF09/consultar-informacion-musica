package com.aluracursos.musica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "canciones")
public class Cancion {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreCancion;
    private String banda;
    private String album;
    private String genero;
    private Integer fechaDeLanzamiento;
    @ManyToOne
    private Artista artista;

    //Constructor vacío
    public Cancion() {}

    //Constructor con atributos
    public Cancion(String nombreCancion, String banda, String album, String genero, Integer fechaDeLanzamiento) {
        this.nombreCancion = nombreCancion;
        this.banda = banda;
        this.album = album;
        this.genero = genero;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    //Getters y Setters de los atributos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(Integer fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    //toString para mostrar la información
    @Override
    public String toString() {
        return "\nCanción:" + nombreCancion + "\n" +
                "Artista: " + artista.getNombreArtista() + "\n" +
                "Banda: " + banda + "\n" +
                "Álbum: " + album + "\n" +
                "Género: " + genero + "\n" +
                "Fecha de lanzamiento: " + fechaDeLanzamiento;
    }
}
