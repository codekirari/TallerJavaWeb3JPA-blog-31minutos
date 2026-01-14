package com.example.blogejercicio.service;

import com.example.blogejercicio.model.Comentario;
import com.example.blogejercicio.model.Posteo;
import com.example.blogejercicio.repository.IposteoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo {

    private final IposteoRepository posteoRepository;

    public PosteoService(IposteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Posteo> obtenerTodos() {
        return posteoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Posteo obtenerPorId(Long id) {
        Posteo post = posteoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posteo no encontrado"));
        post.getComentarios().size();
        return post;
    }

    @Override
    public void guardarPosteo(Posteo posteo) {
        posteoRepository.save(posteo);
    }

    @Override
    public void eliminarPosteo(Long id) {
        posteoRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void editarPosteo(Long id, Posteo posteoActualizado) {
        Posteo posteoExistente = this.obtenerPorId(id);

        posteoExistente.setTitulo_Posteo(posteoActualizado.getTitulo_Posteo());
        posteoExistente.setAutor(posteoActualizado.getAutor());

        posteoRepository.save(posteoExistente);
    }


    @Override
    @Transactional
    public Posteo agregarComentario(Long posteoId, Comentario comentario) {
        Posteo posteo = this.obtenerPorId(posteoId);

        comentario.setPosteo(posteo);
        posteo.getComentarios().add(comentario);

        return posteoRepository.save(posteo);
    }
}