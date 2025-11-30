package com.metis.opportunity_recommendation_algorithm.internal.models;

// Importante: Adicionamos o import do Enum
import com.metis.opportunity_recommendation_algorithm.internal.models.enums.RelationType;

public class KnowledgeGraph {
    
    public void addNode(Object node) {
        // Mock: não faz nada
    }

    // Correção aqui: Mudamos de 'String type' para 'RelationType type'
    public void addEdge(String sourceId, RelationType type, String targetId) {
        // Mock: não faz nada
    }
}