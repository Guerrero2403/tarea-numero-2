package com.demo.hola_spring.controladores;

import com.demo.hola_spring.modelos.Libro;
import com.demo.hola_spring.servicios.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;

    public LibroController() {
        this.libroService = new LibroService();
    }

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.getAllLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibroById(@PathVariable("id") Long id) {
        return libroService.getLibroById(id);
    }

    @PostMapping
    public void addLibro(@RequestBody Libro libro) {
        libroService.addLibro(libro);
    }
}
