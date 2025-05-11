package org.example.SpringBootDomashka.repository;

import org.example.SpringBootDomashka.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
