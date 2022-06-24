package org.example.category;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CatMapper {

    Category toCategory(CatDTO catDTO);

    CatDTO toCategoryDTO(Category category);

    List<CatDTO> toCatDTOs(List<Category> categoryList);

    List<Category> toCategories(List<CatDTO> catDTOList);
}
