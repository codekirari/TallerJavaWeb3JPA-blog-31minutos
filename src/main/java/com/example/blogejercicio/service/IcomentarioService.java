package com.example.blogejercicio.service;

import com.example.blogejercicio.model.Comentario;

import java.util.List;

public interface IcomentarioService {
    List<Comentario> obtenerTodos();
    void eliminarComentario(Long id);
}
