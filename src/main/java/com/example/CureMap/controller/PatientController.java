package com.example.CureMap.controller;

import com.example.CureMap.dto.patient.PatientRequestDto;
import com.example.CureMap.dto.patient.PatientResponseDto;
import com.example.CureMap.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody PatientRequestDto dto) {
        Long id = patientService.createPatient(dto);
        return ResponseEntity.ok(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientResponseDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(patientService.getPatient(id));
    }
}
