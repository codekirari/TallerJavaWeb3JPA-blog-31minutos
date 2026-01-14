package com.example.blogejercicio.service;

import com.example.blogejercicio.model.Comentario;
import com.example.blogejercicio.repository.IcomentarioRepository; // Asegúrate de la "I" mayúscula
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComentarioService implements IcomentarioService {

    private final IcomentarioRepository comentarioRepo;

    public ComentarioService(IcomentarioRepository comentarioRepo) {
        this.comentarioRepo = comentarioRepo;
    }

    @Override
    public List<Comentario> obtenerTodos() {
        return comentarioRepo.findAll();
    }

    @Override
    public void eliminarComentario(Long id) {
        comentarioRepo.deleteById(id);
    }
}