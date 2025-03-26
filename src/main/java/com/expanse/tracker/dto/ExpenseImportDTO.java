package com.expanse.tracker.dto;


import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseImportDTO {
    private Long id;
    private String description;
    private Double amount;
    private LocalDateTime date;
    private String source; // SMS, EMAIL
    private boolean confirmed;
}

