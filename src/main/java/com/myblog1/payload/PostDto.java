package com.myblog1.payload;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min = 2,message = "post Title should have at least 2 charaters")
    private  String title;
    @NotEmpty
    @Size(min = 10,message = "post description should have at least 10 charaters")
    private String description;
    private  String content;
}
