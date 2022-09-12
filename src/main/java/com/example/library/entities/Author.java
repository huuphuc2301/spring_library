package com.example.library.entities;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author")
public class Author implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_year")
    private int birthYear;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private Nationality nationality;

}
