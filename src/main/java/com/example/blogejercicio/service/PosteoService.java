package com.example.blogejercicio.service;

import com.example.blogejercicio.model.Posteo;
import com.example.blogejercicio.repository.IposteoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired; // Importante para que funcione
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo {

    private final IposteoRepository posteoRepository;

    public PosteoService(IposteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

//    @Autowired
//    private IposteoRepository posteoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Posteo> obtenerTodos() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo obtenerPorId(Long id) {
        return posteoRepository.findById(id).orElse(null);
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
    public void editarPosteo(Long id, Posteo posteoActualizado) {
        Posteo posteoExistente = this.obtenerPorId(id);

        if (posteoExistente != null) {
            posteoExistente.setTitulo_Posteo(posteoActualizado.getTitulo_Posteo());
            posteoExistente.setAutor_Posteo(posteoActualizado.getAutor_Posteo());

            posteoRepository.save(posteoExistente);
        }
    }
}