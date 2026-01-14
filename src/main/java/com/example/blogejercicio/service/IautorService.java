package com.example.blogejercicio.service;

import com.example.blogejercicio.model.Autor;
import com.example.blogejercicio.model.Posteo;

import java.util.List;
import java.util.Optional;

public interface IautorService {
    List<Autor> obtenerTodos();
    Optional<Autor> obtenerPorId(Long id);
    Autor guardarAutor(Autor autor);
    Autor agregarPosteo(Long autorId, Posteo posteo);
    }