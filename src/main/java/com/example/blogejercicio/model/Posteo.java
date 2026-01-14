package com.example.blogejercicio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "posteos")
public class Posteo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Posteo;

    @Column(nullable = false, length = 100)
    private String titulo_Posteo;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    @JsonBackReference
    private Autor autor;

    @OneToMany(mappedBy = "posteo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Comentario> comentarios = new ArrayList<>();

    public Posteo() {
    }


    public Long getId_Posteo() {
        return id_Posteo;
    }

    public void setId_Posteo(Long id_Posteo) {
        this.id_Posteo = id_Posteo;
    }

    public String getTitulo_Posteo() {
        return titulo_Posteo;
    }

    public void setTitulo_Posteo(String titulo_Posteo) {
        this.titulo_Posteo = titulo_Posteo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}