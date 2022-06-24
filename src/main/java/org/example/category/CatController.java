package org.example.category;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor

public class CatController {
    private final IServiceCat service;
    private final CatMapper mapper;

    @PostMapping("/ver 1")
    public ResponseEntity<Void> saveNew (@RequestBody CatDTO catDTO){
        Category category = mapper.toCategory(catDTO);
        service.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("ver 1/{id}")
    public ResponseEntity<CatDTO> getById(@RequestBody Long id){
        Category category =service.getById(id);
        CatDTO catDTO = mapper.toCategoryDTO(category);
        return ResponseEntity.ok(catDTO) ;
    }


    @GetMapping("/ver 1")
    public ResponseEntity<List<CatDTO>> getAll() {

        List<Category> categories = service.getAll();
        List<CatDTO> catDTOList = mapper.toCatDTOs(categories);

        return ResponseEntity.ok(catDTOList);

    }
}
