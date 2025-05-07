package com.example.CureMap.dto.symptomInfo;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class SymptomInfoRequestDto {
    private Long patientId;
    private String symptomName;
    private String affectedArea;
    private LocalDate onsetDate;
    private int severityLevel;
    private String additionalNote;
}
