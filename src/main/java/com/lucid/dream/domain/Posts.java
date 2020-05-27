package com.lucid.dream.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 500, nullable = false)
    @NotBlank
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    @NotBlank
    private String content;

    @NotBlank
    private String author;

    @Builder
    public Posts(String title, String content, String author, String img) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
