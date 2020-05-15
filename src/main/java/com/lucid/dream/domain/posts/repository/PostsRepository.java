package com.lucid.dream.domain.posts.repository;

import com.lucid.dream.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
