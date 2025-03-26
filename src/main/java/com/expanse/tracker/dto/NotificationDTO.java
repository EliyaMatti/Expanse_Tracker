package com.expanse.tracker.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {
    private Long id;
    private String message;
    private LocalDateTime createdAt;
    private boolean readStatus;
}

