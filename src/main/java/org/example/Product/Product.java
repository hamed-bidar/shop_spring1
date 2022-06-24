package org.example.Product;

import lombok.Data;
import org.example.category.Category;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title",nullable = false)
    String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
