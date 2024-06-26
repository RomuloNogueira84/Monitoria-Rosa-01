package com.romulonogueira.bookstore.repositories;

import java.util.Optional;

import com.romulonogueira.bookstore.model.Livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

    Optional<Livro> findByIdAndCategoriaId(Integer idLivro, Integer idCategoria);
    
}
