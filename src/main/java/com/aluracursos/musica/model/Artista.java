package com.aluracursos.musica.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "artistas")
public class Artista {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String nombreArtista;
    @Enumerated(EnumType.STRING)
    private TipoArtista tipoArtista;
    private Integer fechaNacimiento;
    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Cancion> canciones;

    //Constructor vacío
    public Artista() {}

    //Constructor con atributos
    public Artista(String nombreArtista, TipoArtista tipoArtista, Integer fechaNacimiento) {
        this.nombreArtista = nombreArtista;
        this.tipoArtista = tipoArtista;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters y Setters de los atributos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(TipoArtista tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    //toString para mostrar la información
    @Override
    public String toString() {
        return "\nNombre del cantante: " + nombreArtista + "\n" +
                "Tipo de cantante: " + tipoArtista + "\n" +
                "Fecha de nacimiento: " + fechaNacimiento;
    }
}
