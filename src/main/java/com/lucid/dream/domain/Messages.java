package com.lucid.dream.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity

public class Messages {

    @Id
    private Integer id;

    private String userName;

    private String content;
}
