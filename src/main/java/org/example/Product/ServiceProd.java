package org.example.Product;

import lombok.AllArgsConstructor;
import org.example.category.IServiceCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceProd implements IServiceProd {
    private final ProdRepo repository;
    private final IServiceCat categoryIService ;

    @Override
    public Product save(Product bank) {
        return null;
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
