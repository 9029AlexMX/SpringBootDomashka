package org.example.SpringBootDomashka.dto.todo;

import lombok.Data;
import org.example.SpringBootDomashka.model.Todo;

import java.time.LocalDateTime;

@Data
public class TodoResponseDto extends TodoDtoAbstract {
    private Long id;
    private Todo.Status status;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long userId;
}
