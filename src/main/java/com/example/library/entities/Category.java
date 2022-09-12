package com.example.library.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
