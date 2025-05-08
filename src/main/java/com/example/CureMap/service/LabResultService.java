package com.example.CureMap.service;

import com.example.CureMap.domain.LabResult;
import com.example.CureMap.domain.Patient;
import com.example.CureMap.dto.labResult.LabResultRequestDto;
import com.example.CureMap.dto.labResult.LabResultResponseDto;
import com.example.CureMap.repository.LabResultRepository;
import com.example.CureMap.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LabResultService {
    private final LabResultRepository labResultRepository;
    private final PatientRepository patientRepository;

    public LabResultResponseDto createLabResult(LabResultRequestDto dto) {
        Patient patient = patientRepository.findById(dto.getPatientId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid patient ID"));

        LabResult labResult = LabResult.builder()
                .patient(patient)
                .testName(dto.getTestName())
                .testValue(dto.getTestValue())
                .unit(dto.getUnit())
                .testDate(dto.getTestDate())
                .build();

        LabResult saved = labResultRepository.save(labResult);

        return LabResultResponseDto.builder()
                .patientId(saved.getId())
                .testName(saved.getTestName())
                .testValue(saved.getTestValue())
                .unit(saved.getUnit())
                .testDate(saved.getTestDate())
                .build();
    }

}
