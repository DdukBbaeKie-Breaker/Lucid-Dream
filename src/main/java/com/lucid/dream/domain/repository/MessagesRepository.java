package com.lucid.dream.domain.repository;

import com.lucid.dream.domain.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages, Integer> {
}
