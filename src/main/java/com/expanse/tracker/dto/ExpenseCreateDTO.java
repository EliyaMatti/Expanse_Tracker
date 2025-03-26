package com.expanse.tracker.dto;


import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseCreateDTO {
    private String description;
    private Double amount;
    private LocalDateTime date;
    private String source;
    private Long categoryId;
}

