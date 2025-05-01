package org.example.SpringBootDomashka.dto.todo;

import lombok.Data;
import org.example.SpringBootDomashka.model.Todo.Priority;

import java.time.LocalDateTime;

@Data
public class CreateTodoDto {
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private Priority priority;
}
