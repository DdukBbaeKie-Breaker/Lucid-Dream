package com.lucid.dream.domain.posts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Files {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer postId;

    private String fileName;
}
