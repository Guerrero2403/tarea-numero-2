package com.demo.hola_spring.repositories;

import com.demo.hola_spring.modelos.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository() {
        // Añadir libros quemados
        libros.add(new Libro(1L, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 1967));
        libros.add(new Libro(2L, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", 1605));
    }

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}