package com.example.CureMap.controller;

import com.example.CureMap.dto.labResult.LabResultRequestDto;
import com.example.CureMap.dto.labResult.LabResultResponseDto;
import com.example.CureMap.service.LabResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lab-result")
@RequiredArgsConstructor
public class LabResultController {

    private final LabResultService labResultService;

    @PostMapping
    public ResponseEntity<LabResultResponseDto> createLabReslt(@RequestBody LabResultRequestDto dto){
        return ResponseEntity.ok(labResultService.createLabResult(dto));
    }
}
