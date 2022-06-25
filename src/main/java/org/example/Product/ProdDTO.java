package org.example.Product;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.category.CatDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ProdDTO {


    @ApiModelProperty(required = false, hidden = true)
    private Long id;


    @NotNull
    @NotBlank
    @ApiModelProperty(required = true, hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private CatDTO category;
}
