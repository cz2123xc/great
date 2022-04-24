//package com.example.great.repository;
//
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import javax.persistence.*;
//
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "email", nullable = false)
//    private String email;
//
//    @Column(name = "name", nullable = false)
//    private String name;
//
//    @CreationTimestamp
//    @Column(name = "created_at", nullable = false)
//    private Long createdAt;
//
//    @UpdateTimestamp
//    @Column(name = "updated_at", nullable = false)
//    private Long updatedAt;
//
//
//}
