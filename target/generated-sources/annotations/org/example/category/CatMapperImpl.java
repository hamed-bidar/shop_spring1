package org.example.category;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-22T16:51:05+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CatMapperImpl implements CatMapper {

    @Override
    public Category toCategory(CatDTO catDTO) {
        if ( catDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( catDTO.getId() );
        category.setTitle( catDTO.getTitle() );

        return category;
    }

    @Override
    public CatDTO toCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CatDTO catDTO = new CatDTO();

        catDTO.setId( category.getId() );
        catDTO.setTitle( category.getTitle() );

        return catDTO;
    }

    @Override
    public List<CatDTO> toCatDTOs(List<Category> categoryList) {
        if ( categoryList == null ) {
            return null;
        }

        List<CatDTO> list = new ArrayList<CatDTO>( categoryList.size() );
        for ( Category category : categoryList ) {
            list.add( toCategoryDTO( category ) );
        }

        return list;
    }

    @Override
    public List<Category> toCategories(List<CatDTO> catDTOList) {
        if ( catDTOList == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( catDTOList.size() );
        for ( CatDTO catDTO : catDTOList ) {
            list.add( toCategory( catDTO ) );
        }

        return list;
    }
}
