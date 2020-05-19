package com.lucid.dream.domain.posts;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;


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
    @NotEmpty
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    @NotEmpty
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author, String img) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
