package com.demo.hola_spring.servicios;

import java.util.List;

import com.demo.hola_spring.modelos.Persona;

public interface PersonaService {
    Persona getPersona(int id);
    List<Persona> getPersonas();
    Persona nuevPersona(Persona persona);
}
