package com.demo.hola_spring.repositories;

import java.util.ArrayList;
import java.util.List;

import com.demo.hola_spring.modelos.Persona;

public class PersonaRepositoryDemo implements PersonaRepository {

    private List<Persona> personas = new ArrayList<>();


    public PersonaRepositoryDemo(){
        personas.add(new Persona(1000, "Galo", "Vera"));
        personas.add(new Persona(1001, "Maria", "Perez"));
        personas.add(new Persona(1002, "Luis", "Miranda"));
    }

    public Persona getPersona(int id){
        System.out.println("Conectado a base de datos ORACLE");
        for(Persona persona: personas){
            if(id == persona.getId())
                return persona;

        }

        return null;
    }

    public List<Persona> getPersonas(){
        System.out.println("Conectado a base de datos ORACLE");
        return personas;
    }

    @Override
    public Persona nuevPersona(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuevPersona'");
    }

}
