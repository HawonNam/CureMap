package com.example.CureMap.service;

import com.example.CureMap.domain.PredictionResult;
import com.example.CureMap.dto.predictionResult.PredictionResultResponseDto;
import com.example.CureMap.repository.PredictionResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PredictionResultService {

    private final PredictionResultRepository predictionResultRepository;

    public PredictionResultResponseDto getPredictionResult(Long patientId) {
        // 환자 ID로 예측 결과를 가져옴
        PredictionResult predictionResult = predictionResultRepository.findByPatientId(patientId)
                .orElseThrow(() -> new RuntimeException("Prediction result not found for patient id: " + patientId));

        return new PredictionResultResponseDto(predictionResult);
    }
}
