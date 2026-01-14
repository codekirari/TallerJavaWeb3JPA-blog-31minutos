package com.example.blogejercicio.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Comentario;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String texto;

    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "id_posteo")
    @JsonBackReference
    private Posteo posteo;

    public Comentario(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Comentario(){

    }

    public Comentario(Long id_Comentario, String texto, LocalDateTime fechaCreacion, Posteo posteo) {
        this.id_Comentario = id_Comentario;
        this.texto = texto;
        this.fechaCreacion = fechaCreacion;
        this.posteo = posteo;
    }

    public Long getId_Comentario() {
        return id_Comentario;
    }

    public void setId_Comentario(Long id_Comentario) {
        this.id_Comentario = id_Comentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Posteo getPosteo() {
        return posteo;
    }

    public void setPosteo(Posteo posteo) {
        this.posteo = posteo;
    }
}