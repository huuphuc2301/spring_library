package com.example.library.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "nationality")
public class Nationality implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}

