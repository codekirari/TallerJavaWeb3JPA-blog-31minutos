package com.example.blogejercicio.repository;

import com.example.blogejercicio.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IautorRepository extends JpaRepository<Autor, Long> {
}
