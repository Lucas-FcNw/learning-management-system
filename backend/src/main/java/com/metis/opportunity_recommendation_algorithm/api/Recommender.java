package com.metis.opportunity_recommendation_algorithm.api;

import com.metis.opportunity_recommendation_algorithm.api.response.OpportunityResponse;
import java.util.ArrayList;
import java.util.List;

public class Recommender {
    public List<OpportunityResponse> recommend(String userId, int topN) {
        // Retorna lista vazia para não quebrar o front
        return new ArrayList<>();
    }
}