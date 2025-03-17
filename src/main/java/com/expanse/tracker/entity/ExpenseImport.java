package com.expanse.tracker.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "expense_imports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseImport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private ExpenseSource source; // SMS, EMAIL

    private boolean confirmed = false; // User confirms before adding
}
