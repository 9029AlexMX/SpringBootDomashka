package org.example.SpringBootDomashka.service;

import org.example.SpringBootDomashka.dto.todo.TodoCreateDto;
import org.example.SpringBootDomashka.dto.todo.TodoResponseDto;

public interface TodoService {
    public TodoResponseDto save(TodoCreateDto todoCreateDto);
}
