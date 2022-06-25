package org.example.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
@Data
public class ProdController {

    private final IServiceProd service;
    private final ProductMapper mapper;

    @PostMapping("/ver 1")
    public ResponseEntity<Void> save(@RequestBody ProdDTO prodDTO) {

        Product product = mapper.toProduct(prodDTO);
        service.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @GetMapping("/ver 1 /{id}")
    public ResponseEntity<ProdDTO> getById(@PathVariable Long id) {

        Product product = service.getById(id);
        ProdDTO prodDTO = mapper.toProductDTO(product);
        return ResponseEntity.ok(prodDTO);
    }

    @GetMapping("/ver 1")
    public ResponseEntity<List<ProdDTO>> getAll() {


        List<Product> products = service.getAll();
        List<ProdDTO> prodDTOList = mapper.toProductDTOs(products);

        return ResponseEntity.ok(prodDTOList);

    }

}

