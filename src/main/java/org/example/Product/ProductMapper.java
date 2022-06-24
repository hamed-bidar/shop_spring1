package org.example.Product;

import org.example.category.CatMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CatMapper.class})

public interface ProductMapper {

    Product toProduct(ProdDTO productDTO);

    ProdDTO toProductDTO(Product product);

    List<ProdDTO> toProductDTOs(List<Product> productList);

    List<Product> toProducts(List<ProdDTO> prodDTOList);

}
