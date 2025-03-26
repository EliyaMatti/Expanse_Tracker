package com.expanse.tracker.dto;


import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDTO {
    private Long id;
    private String description;
    private Double amount;
    private LocalDateTime date;
    private String source;  // MANUAL, SMS, EMAIL
    private String category;
}
