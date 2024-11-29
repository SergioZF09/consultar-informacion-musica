package com.aluracursos.musica.repository;

import com.aluracursos.musica.model.Artista;
import com.aluracursos.musica.model.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    Optional<Artista> findByNombreArtistaContainsIgnoreCase(String nombreArtista);

    @Query("SELECT c FROM Artista a JOIN a.canciones c WHERE a.nombreArtista ILIKE %:nombreArtista%")
    List<Cancion> buscarCancionesPorArtista(String nombreArtista);
}
