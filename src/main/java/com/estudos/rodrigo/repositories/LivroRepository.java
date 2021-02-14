package com.estudos.rodrigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.rodrigo.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
