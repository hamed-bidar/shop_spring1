package org.example.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Data

public class ServiceCat implements IServiceCat {
    private final CatRepo repository;

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Category update(Category category) {
        repository.findById(category.getId()).orElseThrow();
         return repository.save(category);
    }


    @Override
    public void delete(Long id) {
        repository.findById(id ).orElseThrow();
        repository.deleteById(id);
    }

    @Override
    public Category getById(Long id) {

        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Category> getAll() {
        return (List<Category>) repository.findAll();
    }

}
