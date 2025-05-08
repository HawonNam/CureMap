package com.example.CureMap.dto.symptomInfo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class SymptomInfoRequestDto {
    private Long patientId;
    private String symptomName;
    private String affectedArea;
    private LocalDate onsetDate;
    private int severityLevel;
    private String additionalNote;
}
