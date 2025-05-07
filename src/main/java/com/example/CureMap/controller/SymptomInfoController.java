package com.example.CureMap.controller;

import com.example.CureMap.dto.symptomInfo.SymptomInfoRequestDto;
import com.example.CureMap.dto.symptomInfo.SymptomInfoResponseDto;
import com.example.CureMap.service.SymptomInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/symptoms")
public class SymptomInfoController {

    private final SymptomInfoService symptomInfoService;

    @PostMapping
    public  Long create(@RequestBody SymptomInfoRequestDto dto){
        return symptomInfoService.create(dto);
    }

    @GetMapping
    public List<SymptomInfoResponseDto> getAll() {
        return symptomInfoService.findAll();
    }

}
