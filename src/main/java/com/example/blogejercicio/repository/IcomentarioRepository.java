package com.example.blogejercicio.repository;

import com.example.blogejercicio.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IcomentarioRepository extends JpaRepository<Comentario, Long> {
}
