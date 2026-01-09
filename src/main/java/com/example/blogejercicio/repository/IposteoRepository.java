package com.example.blogejercicio.repository;

import com.example.blogejercicio.model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IposteoRepository extends JpaRepository<Posteo, Long> {

}