package com.example.CureMap.service;

import com.example.CureMap.domain.Patient;
import com.example.CureMap.domain.SymptomInfo;
import com.example.CureMap.dto.symptomInfo.SymptomInfoRequestDto;
import com.example.CureMap.dto.symptomInfo.SymptomInfoResponseDto;
import com.example.CureMap.repository.PatientRepository;
import com.example.CureMap.repository.SymptomInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SymptomInfoService {
    private final SymptomInfoRepository symptomInfoRepository;
    private final PatientRepository patientRepository;

    public Long create(SymptomInfoRequestDto dto) {
        Patient patient = patientRepository.findById(dto.getPatientId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid patient ID"));

        SymptomInfo symptomInfo = SymptomInfo.builder()
                .patient(patient)
                .symptomName(dto.getSymptomName())
                .affectedArea(dto.getAffectedArea())
                .onsetDate(dto.getOnsetDate())
                .severityLevel(dto.getSeverityLevel())
                .additionalNote(dto.getAdditionalNote())
                .build();

        return symptomInfoRepository.save(symptomInfo).getId();
    }

    public List<SymptomInfoResponseDto> findAll() {
        return symptomInfoRepository.findAll().stream()
                .map(SymptomInfoResponseDto::new)
                .collect(Collectors.toList());
    }
}
