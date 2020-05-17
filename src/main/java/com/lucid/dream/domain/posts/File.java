package com.lucid.dream.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private Integer postId;

    private String fileName;

    private String imgName;

    @Builder
    public File(Integer postId, String imgName, String fileName) {
        this.postId = postId;
        this.imgName = imgName;
        this.fileName = fileName;
    }
}
