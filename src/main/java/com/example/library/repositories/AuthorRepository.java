package com.example.library.repositories;

import com.example.library.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findAll();

    Author findById(int id);

    @Query("select distinct a from Author a order by a.name")
    List<Author> findAllSorted();
}
