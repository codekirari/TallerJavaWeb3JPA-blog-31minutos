package com.example.blogejercicio.service;

import com.example.blogejercicio.model.Posteo;
import com.example.blogejercicio.model.Comentario;
import java.util.List;

public interface IservicePosteo {
    List<Posteo> obtenerTodos();
    Posteo obtenerPorId(Long id);
    void guardarPosteo(Posteo posteo);
    void eliminarPosteo(Long id);
    void editarPosteo(Long id, Posteo posteoActualizado);
    Posteo agregarComentario(Long posteoId, Comentario comentario);
}