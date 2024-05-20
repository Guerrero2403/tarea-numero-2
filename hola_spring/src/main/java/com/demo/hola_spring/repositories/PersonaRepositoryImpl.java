package com.demo.hola_spring.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.hola_spring.modelos.Persona;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository {
    private List<Persona> personas = new ArrayList<>();


    public PersonaRepositoryImpl(){
        personas.add(new Persona(1000, "Galo", "Vera"));
        personas.add(new Persona(1001, "Maria", "Perez"));
        personas.add(new Persona(1002, "Luis", "Miranda"));
    }

    public Persona getPersona(int id){
        for(Persona persona: personas){
            if(id == persona.getId())
                return persona;

        }

        return null;
    }

    public List<Persona> getPersonas(){
        System.out.println("Conectado a base de datos POSTGRESQL");
        return personas;
    }

    @Override
    public Persona nuevPersona(Persona persona) {
        personas.add(persona);
        return persona;
    }
}
