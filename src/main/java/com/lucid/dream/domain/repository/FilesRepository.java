package com.lucid.dream.domain.repository;

import com.lucid.dream.domain.FilesLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<FilesLocation, Integer> {
}
