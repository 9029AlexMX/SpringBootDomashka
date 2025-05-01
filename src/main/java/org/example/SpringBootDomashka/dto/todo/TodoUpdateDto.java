package org.example.SpringBootDomashka.dto.todo;

import lombok.Data;
import org.example.SpringBootDomashka.model.Todo.Status;

@Data
public class TodoUpdateDto extends TodoDtoAbstract {
    private Status status;
}
