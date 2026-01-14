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
    private String text;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "id_posteo")
    @JsonBackReference
    private Posteo posteo;


    public Comentario() {
        this.createdAt = LocalDateTime.now();
    }


    public Comentario(Long id_Comentario, String text, Posteo posteo) {
        this.id_Comentario = id_Comentario;
        this.text = text;
        this.posteo = posteo;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId_Comentario() {
        return id_Comentario;
    }

    public void setId_Comentario(Long id_Comentario) {
        this.id_Comentario = id_Comentario;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Posteo getPosteo() {
        return posteo;
    }

    public void setPosteo(Posteo posteo) {
        this.posteo = posteo;
    }
}