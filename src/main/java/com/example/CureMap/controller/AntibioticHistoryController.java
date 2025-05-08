package com.example.CureMap.controller;

import com.example.CureMap.dto.antibioticHistory.AntibioticHistoryResponseDto;
import com.example.CureMap.service.AntibioticHistoryService;
import com.example.CureMap.service.AntibioticRecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/antibiotic-history")
public class AntibioticHistoryController {

    private  final AntibioticHistoryService historyService;

    @GetMapping("/{patientId}")
    public List<AntibioticHistoryResponseDto> getHistory(@PathVariable Long patientId){
        return historyService.getHistoryByPatientId(patientId);
    }
}
