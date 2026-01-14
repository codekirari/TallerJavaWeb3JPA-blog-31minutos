package com.example.blogejercicio.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Autor;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;


    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Posteo> posteos = new ArrayList<>();


    public Autor() {
    }

    public Long getId_Autor() {
        return id_Autor;
    }

    public void setId_Autor(Long id_Autor) {
        this.id_Autor = id_Autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Posteo> getPosteos() {
        return posteos;
    }

    public void setPosteos(List<Posteo> posteos) {
        this.posteos = posteos;
    }

    public Autor(Long id_Autor, String nombre, String email, List<Posteo> posteos) {
        this.id_Autor = id_Autor;
        this.nombre = nombre;
        this.email = email;
        this.posteos = posteos;




    }
}

