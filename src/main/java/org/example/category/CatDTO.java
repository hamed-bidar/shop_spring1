package org.example.category;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.Common.BaseDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CatDTO extends BaseDTO {


    @ApiModelProperty(required = false, hidden = true)
    private Long id;


    @NotNull
    @NotBlank
    @ApiModelProperty(required = true, hidden = false)
    private String title;
}
