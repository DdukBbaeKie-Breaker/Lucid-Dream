package com.lucid.dream.dto;

import com.lucid.dream.domain.posts.File;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ImgsSaveRequestDto {

    private Integer postId;

    private String imgName;

    public File toEntity() {
        return File.builder()
                .postId(postId)
                .imgName(imgName)
                .build();
    }
}
