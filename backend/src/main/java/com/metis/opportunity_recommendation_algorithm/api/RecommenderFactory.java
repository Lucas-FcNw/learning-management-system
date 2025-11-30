package com.metis.opportunity_recommendation_algorithm.api;

import com.metis.opportunity_recommendation_algorithm.internal.models.KnowledgeGraph;

public class RecommenderFactory {
    public static Recommender create(KnowledgeGraph graph) {
        return new Recommender();
    }
}