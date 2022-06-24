package org.example.Product;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-22T16:51:06+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toProduct(ProdDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDTO.getId() );
        product.setTitle( productDTO.getTitle() );

        return product;
    }

    @Override
    public ProdDTO toProductDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProdDTO prodDTO = new ProdDTO();

        prodDTO.setId( product.getId() );
        prodDTO.setTitle( product.getTitle() );

        return prodDTO;
    }

    @Override
    public List<ProdDTO> toProductDTOs(List<Product> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProdDTO> list = new ArrayList<ProdDTO>( productList.size() );
        for ( Product product : productList ) {
            list.add( toProductDTO( product ) );
        }

        return list;
    }

    @Override
    public List<Product> toProducts(List<ProdDTO> prodDTOList) {
        if ( prodDTOList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( prodDTOList.size() );
        for ( ProdDTO prodDTO : prodDTOList ) {
            list.add( toProduct( prodDTO ) );
        }

        return list;
    }
}
