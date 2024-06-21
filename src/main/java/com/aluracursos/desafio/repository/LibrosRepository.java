package com.aluracursos.desafio.repository;


import com.aluracursos.desafio.model.Autor;
import com.aluracursos.desafio.model.DatosAutor;
import com.aluracursos.desafio.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibrosRepository extends JpaRepository<Libros,Long> {

    Libros findByTituloContainsIgnoreCase(String nombreLibro);

    List<Libros> findByIdiomas(String idioma);


}