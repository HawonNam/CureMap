package com.example.CureMap.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AntibioticRecommendation {

    @Id @GeneratedValue
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String antibioticName;     // 추천 항생제 이름
    private int recommandRank;                  // 추천 순위 (1위, 2위, 3위 등)
    private double score;              // 종합 점수 또는 확률 기반 추천 점수
    private String rationale;          // 추천 이유 요약 (예: "과거 사용 이력 없음 + 치료 성공률 87%")

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prediction_result_id")
    private PredictionResult predictionResult;
}
