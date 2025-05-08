package com.example.CureMap.controller;

import com.example.CureMap.dto.symptomInfo.SymptomInfoRequestDto;
import com.example.CureMap.dto.symptomInfo.SymptomInfoResponseDto;
import com.example.CureMap.service.SymptomInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/patients/{id}/symptoms")
public class SymptomInfoController {

    private final SymptomInfoService symptomInfoService;

    @PostMapping
    public ResponseEntity<String> createSymptom(@PathVariable Long id, @RequestBody SymptomInfoRequestDto dto){
        dto.setPatientId(id);
        symptomInfoService.create(dto);
        return ResponseEntity.ok("증상 정보가 저장되었습니다.");
    }
}
