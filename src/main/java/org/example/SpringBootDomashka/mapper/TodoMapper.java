package org.example.SpringBootDomashka.mapper;

import org.example.SpringBootDomashka.config.MapperConfig;
import org.example.SpringBootDomashka.dto.todo.TodoCreateDto;
import org.example.SpringBootDomashka.dto.todo.TodoResponseDto;
import org.example.SpringBootDomashka.model.Todo;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface TodoMapper {
    TodoResponseDto toDto(Todo todo);

    Todo toModel(TodoCreateDto todoCreateDto);
}
