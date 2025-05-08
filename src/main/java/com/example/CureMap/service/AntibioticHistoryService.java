package com.example.CureMap.service;

import com.example.CureMap.domain.AntibioticHistory;
import com.example.CureMap.dto.antibioticHistory.AntibioticHistoryResponseDto;
import com.example.CureMap.repository.AntibioticHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AntibioticHistoryService {

    private final AntibioticHistoryRepository historyRepository;

    public List<AntibioticHistoryResponseDto> getHistoryByPatientId(Long patientId) {
        List<AntibioticHistory> histories = historyRepository.findByPatientId(patientId);

        return histories.stream()
                .map(AntibioticHistoryResponseDto::new)
                .collect(Collectors.toList());
    }
}
