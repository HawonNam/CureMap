package com.example.CureMap.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
public class SymptomInfo {

    @Id @GeneratedValue
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String symptomName; //증상 이름
    private String affectedArea; //영향 부위
    private LocalDate onsetDate; // 증상 시작 날짜
    private int severityLevel; // 증상의 심각도(1~5)
    private String additionalNote; // 메모 필드

}
