package com.demo.hola_spring.repositories;

import java.util.List;

import com.demo.hola_spring.modelos.Persona;

public interface PersonaRepository {
    Persona getPersona(int id);
    List<Persona> getPersonas();
    Persona nuevPersona(Persona persona);

}
