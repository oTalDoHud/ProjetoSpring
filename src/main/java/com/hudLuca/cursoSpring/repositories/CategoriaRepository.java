package com.hudLuca.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hudLuca.cursospring.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}
