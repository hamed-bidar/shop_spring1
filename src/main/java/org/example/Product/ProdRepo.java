package org.example.Product;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdRepo extends PagingAndSortingRepository<Product,Long> {




}
