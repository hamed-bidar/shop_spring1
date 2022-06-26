package org.example.category;

import java.util.List;

public interface ICatService {

    Category save(Category bank);

    Category update(Category category);

    void delete(Long id);

    Category getById(Long id);
    List<Category> getAll();
}
