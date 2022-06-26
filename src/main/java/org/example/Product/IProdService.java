package org.example.Product;

import java.util.List;

public interface IProdService {

    Product save(Product bank);

    Product getById(Long id);

    List<Product> getAll();

    Product update(Product product);

    void delete(Long id);
}

