package org.example.SpringBootDomashka.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="task_history")
public class TaskHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne
    private Todo todo;

    private String oldState;

    private String newState;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime changeDate;

    private String changedBy="";
}
