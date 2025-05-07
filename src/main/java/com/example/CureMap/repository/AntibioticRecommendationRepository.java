package com.example.CureMap.repository;

import com.example.CureMap.domain.AntibioticRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AntibioticRecommendationRepository extends JpaRepository<AntibioticRecommendation, Long> {
}
