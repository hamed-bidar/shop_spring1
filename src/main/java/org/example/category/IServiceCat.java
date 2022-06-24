package org.example.category;

import java.util.List;

public interface IServiceCat {

    Category save(Category bank);

    Category update(Category category);

    void delete(Long id);

    Category getById(Long id);
    List<Category> getAll();
}
