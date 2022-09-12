package com.example.library.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

//    @ManyToMany(mappedBy = "topics")
//    Set<Book> books = new HashSet<>();
}
