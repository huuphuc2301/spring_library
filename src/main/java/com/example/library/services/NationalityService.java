package com.example.library.services;

import com.example.library.entities.Nationality;
import com.example.library.repositories.NationalityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalityService {
    private final NationalityRepository nationalityRepository;

    public NationalityService(NationalityRepository nationalityRepository) {
        this.nationalityRepository = nationalityRepository;
    }

    public List<Nationality> getAll() {
        return nationalityRepository.findAll();
    }

    public Nationality getById(int id) {
        return nationalityRepository.findById(id);
    }
}
