package org.example.category;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "title",nullable = false,unique = true)
    private String title;
}
