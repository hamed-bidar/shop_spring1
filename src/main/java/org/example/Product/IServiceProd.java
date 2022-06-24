package org.example.Product;

import org.example.category.Category;

import java.util.List;

public interface IServiceProd {

    Product save(Product bank);

    Product getById(Long id);

    List<Product> getAll();

    Product update(Product product);

    void delete(Long id);
}

