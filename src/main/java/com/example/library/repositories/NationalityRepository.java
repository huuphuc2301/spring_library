package com.example.library.repositories;

import com.example.library.entities.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NationalityRepository extends JpaRepository<Nationality, Integer> {
    List<Nationality> findAll();

    Nationality findById(int id);
}
