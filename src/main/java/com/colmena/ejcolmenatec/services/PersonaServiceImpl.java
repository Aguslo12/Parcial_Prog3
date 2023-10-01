package com.colmena.ejcolmenatec.services;

import com.colmena.ejcolmenatec.entities.Persona;
import com.colmena.ejcolmenatec.repositories.BaseRepository;
import com.colmena.ejcolmenatec.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    // Autowired nos permite acceder a todos los metodos que incluya nuestra interfaz de PersonaRepository
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
