package org.example.Product;

import lombok.Data;
import org.example.Common.BaseEntity;
import org.example.category.Category;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_product")
@Data
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @NotBlank
    @Column(name = "title", unique = true)
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
