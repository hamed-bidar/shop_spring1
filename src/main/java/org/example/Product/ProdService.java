package org.example.Product;

import lombok.AllArgsConstructor;
import org.example.category.Category;
import org.example.category.ICatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdService implements IProdService {
    private final ProdRepo repository;
    private final ICatService categoryIService ;


    @Override
    public Product save(Product product) {
        Category category = categoryIService.getById(product.getCategory().getId());
        product.setCategory(category);
        return repository.save(product);
    }

    @Override
    public Product update(Product product) {

        repository.findById(product.getId()).orElseThrow();
        return repository.save(product);
    }

    @Override
    public void delete(Long id) {
        repository.findById(id).orElseThrow();

    }

    @Override
    public Product getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) repository.findAll();
    }
}
