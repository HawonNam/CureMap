package com.example.CureMap.dto.labResult;

import com.example.CureMap.domain.LabResult;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class LabResultResponseDto {

    private Long patientId;
    private String testName; // 검사 항목
    private String testValue; // 결과 수치
    private String unit; // 검사 단위
    private LocalDate testDate; // 검사 시행 날짜
    private String interpretation; // 의미 해석(High, Low, Normal)

    public LabResultResponseDto(LabResult entity) {
        this.patientId = entity.getId();
        this.testName = entity.getTestName();
        this.testValue = entity.getTestValue();
        this.unit = entity.getUnit();
        this.testDate = entity.getTestDate();
        this.interpretation = entity.getInterpretation();
    }
}
