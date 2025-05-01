package org.example.SpringBootDomashka.dto.todo;

import org.example.SpringBootDomashka.model.Todo;

import java.time.LocalDateTime;

public abstract class TodoDtoAbstract {
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private Todo.Priority priority;
}
