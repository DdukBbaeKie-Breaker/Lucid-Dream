package com.lucid.dream.domain.repository;

import com.lucid.dream.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Integer> {
}
