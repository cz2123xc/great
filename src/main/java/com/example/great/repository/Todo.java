package com.example.great.repository;

import org.hibernate.annotations.ColumnDefault;
import javax.persistence.*;

@Entity
class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean completed;

    @Column(nullable = false)
    private String todoName;




}
