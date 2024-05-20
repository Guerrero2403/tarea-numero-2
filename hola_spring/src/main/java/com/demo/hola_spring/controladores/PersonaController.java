package com.demo.hola_spring.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hola_spring.modelos.Persona;
import com.demo.hola_spring.servicios.PersonaService;

@RestController
public class PersonaController {

    // @Autowired
    // private PersonaRepository personaRepository;
    @Autowired
    private PersonaService personaService;

    @GetMapping("/hola")
    public String Hola(){
        return "Hola Spring Boot";
    }

    @PostMapping("/personas")
    public Persona nuevaPersona(@RequestBody Persona persona){
        personaService.nuevPersona(persona);
        return persona;
    }

    @GetMapping("/personas/{id}")
    public Persona getPersona(@PathVariable int id){
        Persona persona = personaService.getPersona(id);
        return persona;
    }

    @GetMapping("/personas")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }
    
}
