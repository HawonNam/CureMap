package com.example.CureMap.dto.patient;

import com.example.CureMap.domain.PatientStatus;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class PatientRequestDto {
    private String name;
    private int age;
    private String gender;
    private LocalDate birthDate;
    private String phoneNumber;
    private String email;
    private List<String> underlyingDiseases;
    private LocalDate registrationDate;
    private PatientStatus status;
}
