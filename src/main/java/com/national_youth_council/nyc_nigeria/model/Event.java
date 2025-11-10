package com.national_youth_council.nyc_nigeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "event_tbl")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String venue;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String agenda;
    private String speakers;
    private Double fee;
}
