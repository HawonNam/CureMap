package com.example.CureMap.dto.antibioticHistory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class AntibioticHistoryRequestDto {
    private Long patientId;
    private String antibioticName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String route;    // 투여 경로 (예: 경구, 정맥 등)
    private String dose;     // 용량
    private boolean currentUse;
}
