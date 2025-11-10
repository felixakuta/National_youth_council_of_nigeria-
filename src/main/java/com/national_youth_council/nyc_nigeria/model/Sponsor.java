package com.national_youth_council.nyc_nigeria.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String contactEmail;
    private String boothSize;

    @Enumerated(EnumType.STRING)
    private Status status;
}
