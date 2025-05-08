package com.example.CureMap.dto.antibioticHistory;

import com.example.CureMap.domain.AntibioticHistory;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class AntibioticHistoryResponseDto {
    private Long id;
    private String antibioticName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String route;     // 투약 경로 (예: IV, PO)
    private String does;      // 복용량
    private boolean currentUse; // 현재 복용 중 여부

    public AntibioticHistoryResponseDto(AntibioticHistory entity) {
        this.id = entity.getId();
        this.antibioticName = entity.getAntibioticName();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
        this.route = entity.getRoute();
        this.does = entity.getDoes();
        this.currentUse = entity.isCurrentUse();
    }
}
