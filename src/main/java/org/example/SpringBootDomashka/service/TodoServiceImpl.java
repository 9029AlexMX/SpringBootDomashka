package org.example.SpringBootDomashka.service;

import lombok.RequiredArgsConstructor;
import org.example.SpringBootDomashka.dto.todo.TodoCreateDto;
import org.example.SpringBootDomashka.dto.todo.TodoResponseDto;
import org.example.SpringBootDomashka.repository.TodoRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;
//    private final

    @Override
    public TodoResponseDto save(TodoCreateDto todoCreateDto) {
        return null;
    }
}
