package com.example.blogejercicio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Posteo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental
    private Long id_Posteo;
    private String titulo_Posteo;
    private String autor_Posteo;

    public Posteo(){
    }

    public Posteo(Long id_Posteo, String titulo_Posteo, String autor_Posteo) {
        this.id_Posteo = id_Posteo;
        this.titulo_Posteo = titulo_Posteo;
        this.autor_Posteo = autor_Posteo;
    }

    // colocar los getterysetter
    public Long getId_Posteo() { return id_Posteo; }
    public void setId_Posteo(Long id_Posteo) { this.id_Posteo = id_Posteo; }

    public String getTitulo_Posteo() { return titulo_Posteo; }
    public void setTitulo_Posteo(String titulo_Posteo) { this.titulo_Posteo = titulo_Posteo; }

    public String getAutor_Posteo() { return autor_Posteo; }
    public void setAutor_Posteo(String autor_Posteo) { this.autor_Posteo = autor_Posteo; }
}