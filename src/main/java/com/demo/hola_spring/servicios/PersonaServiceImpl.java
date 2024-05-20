package com.demo.hola_spring.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hola_spring.modelos.Persona;
import com.demo.hola_spring.repositories.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {


    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona getPersona(int id) {
        return personaRepository.getPersona(id);
    }

    @Override
    public List<Persona> getPersonas() {
        return personaRepository.getPersonas();
    }

    @Override
    public Persona nuevPersona(Persona persona) {
        return personaRepository.nuevPersona(persona);
    }

}
