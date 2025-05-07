package com.example.CureMap.service;

import com.example.CureMap.domain.Patient;
import com.example.CureMap.dto.PatientRequestDto;
import com.example.CureMap.dto.PatientResponseDto;
import com.example.CureMap.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Long createPatient(PatientRequestDto dto){
        Patient patient = Patient.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .gender(dto.getGender())
                .birthDate(dto.getBirthDate())
                .phoneNumber(dto.getPhoneNumber())
                .email(dto.getEmail())
                .underlyingDiseases(dto.getUnderlyingDiseases())
                .registrationDate(dto.getRegistrationDate())
                .status(dto.getStatus())
                .build();

        return patientRepository.save(patient).getId();
    }

    public PatientResponseDto getPatient(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("환자를 찾을 수 없습니다."));

        return PatientResponseDto.builder()
                .id(patient.getId())
                .name(patient.getName())
                .age(patient.getAge())
                .gender(patient.getGender())
                .birthDate(patient.getBirthDate())
                .phoneNumber(patient.getPhoneNumber())
                .email(patient.getEmail())
                .underlyingDiseases(patient.getUnderlyingDiseases())
                .registrationDate(patient.getRegistrationDate())
                .status(patient.getStatus())
                .build();
    }
}
