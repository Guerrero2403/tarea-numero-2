package com.demo.hola_spring.servicios;

import com.demo.hola_spring.modelos.Libro;
import com.demo.hola_spring.repositories.LibroRepository;
import java.util.List;
import java.util.Optional;

public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService() {
        this.libroRepository = new LibroRepository();
    }

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    public Optional<Libro> getLibroById(Long id) {
        return libroRepository.findById(id);
    }

    public void addLibro(Libro libro) {
        libroRepository.save(libro);
    }
}