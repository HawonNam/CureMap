package com.example.CureMap.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LabResult {

    @Id @GeneratedValue
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String testName; // 검사 항목
    private String testValue; // 결과 수치
    private String unit; // 검사 단위
    private LocalDate testDate; // 검사 시행 날짜
    private String interpretation; // 의미 해석(High, Low, Normal)

}
