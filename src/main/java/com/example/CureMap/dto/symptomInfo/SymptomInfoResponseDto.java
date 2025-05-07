package com.example.CureMap.dto.symptomInfo;

import com.example.CureMap.domain.SymptomInfo;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class SymptomInfoResponseDto {
    private Long id;
    private String symptomName;
    private String affectedArea;
    private LocalDate onsetDate;
    private int severityLevel;
    private String additionalNote;

    public SymptomInfoResponseDto(SymptomInfo entity) {
        this.id = entity.getId();
        this.symptomName = entity.getSymptomName();
        this.affectedArea = entity.getAffectedArea();
        this.onsetDate = entity.getOnsetDate();
        this.severityLevel = entity.getSeverityLevel();
        this.additionalNote = entity.getAdditionalNote();
    }
}
