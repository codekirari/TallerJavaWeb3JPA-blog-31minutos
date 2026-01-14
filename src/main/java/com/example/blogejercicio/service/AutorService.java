package com.example.blogejercicio.service;

import com.example.blogejercicio.model.Autor;
import com.example.blogejercicio.model.Posteo;
import com.example.blogejercicio.repository.IautorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements IautorService{

    private final IautorRepository iautorRepository;

    public AutorService(IautorRepository iautorRepository) {
        this.iautorRepository = iautorRepository;
    }


    @Override
    public List<Autor> obtenerTodos() {
        return List.of();
    }

    @Override
    public Optional<Autor> obtenerPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Autor guardarAutor(Autor autor) {
        return null;
    }

    @Override
    public Autor agregarPosteo(Long autorId, Posteo posteo) {
        return null;
    }
}
