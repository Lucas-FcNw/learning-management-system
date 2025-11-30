package com.metis.opportunity_recommendation_algorithm.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpportunityResponse {
    private String id;
    private String title;
    private Double matchPercentage; // Ajuste o tipo se necessário baseando-se no front
    private List<String> matchReasons;
}