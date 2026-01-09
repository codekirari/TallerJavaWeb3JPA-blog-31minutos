package com.example.blogejercicio.controller;

import com.example.blogejercicio.model.Posteo;
import com.example.blogejercicio.service.IservicePosteo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos") // La URL base será http://localhost:8080/posteos
public class PosteoController {

    @Autowired
    private IservicePosteo posteoServi;

    // 1. Obtener todos los posteos
    @GetMapping("/traer")
    public List<Posteo> traerPosteos() {
        return posteoServi.obtenerTodos();
    }

    // Buscar un posteo específico por ID
    @GetMapping("/traer/{id}")
    public Posteo traerPosteo(@PathVariable Long id) {
        return posteoServi.obtenerPorId(id);
    }


    // 2. Crear un nuevo posteo
    @PostMapping("/crear")
    public String crearPosteo(@RequestBody Posteo post) {
        posteoServi.guardarPosteo(post);
        return "Posteo creado correctamente en MySQL";
    }

    // 3. Eliminar un posteo
    @DeleteMapping("/borrar/{id}")
    public String borrarPosteo(@PathVariable Long id) {
        posteoServi.eliminarPosteo(id);
        return "Posteo eliminado correctamente";
    }

    // 4. Editar un posteo
    @PutMapping("/editar/{id}")
    public Posteo editarPosteo(@PathVariable Long id, @RequestBody Posteo postActualizado) {
        posteoServi.editarPosteo(id, postActualizado);
        return posteoServi.obtenerPorId(id);
    }


}