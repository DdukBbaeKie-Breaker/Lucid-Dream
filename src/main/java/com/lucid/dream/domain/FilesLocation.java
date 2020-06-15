package com.lucid.dream.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FilesLocation {

    @Id
    @GeneratedValue
    private Integer id;

    private String fileLocation;

    @Builder
    public FilesLocation(String fileLocation) {

        this.fileLocation = fileLocation;
    }
}
