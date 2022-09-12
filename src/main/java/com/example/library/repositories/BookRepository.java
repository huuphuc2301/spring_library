package com.example.library.repositories;


import com.example.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAll();

    Book findById(int id);

    @Query("select distinct b from Book b where b.title like :text or b.author.name like :text order by b.title" )
    List<Book> search(@Param("text") String text);
}
