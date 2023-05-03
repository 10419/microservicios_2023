package com.example.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogo.entity.categoria;

public interface categoriarepository extends JpaRepository<categoria, Integer>{
    
}
