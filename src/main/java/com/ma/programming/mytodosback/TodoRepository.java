package com.ma.programming.mytodosback;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.cloud.sleuth.annotation.NewSpan;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @NewSpan
    java.util.List<Todo> findAll();

    @NewSpan
    Optional<Todo> findById(Long id);

    @NewSpan
    <S extends Todo> S saveAndFlush(S entity);

    @NewSpan
    boolean existsById(Long id);

    @NewSpan
    void deleteById(Long id);
}
