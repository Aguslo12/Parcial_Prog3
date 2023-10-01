package com.colmena.ejcolmenatec.services;

import com.colmena.ejcolmenatec.entities.Autor;
import com.colmena.ejcolmenatec.repositories.AutorRepository;
import com.colmena.ejcolmenatec.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
