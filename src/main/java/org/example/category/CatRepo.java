package org.example.category;

 import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CatRepo extends PagingAndSortingRepository<Category,Long> {


}
