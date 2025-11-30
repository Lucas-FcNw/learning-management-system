package com.metis.opportunity_recommendation_algorithm.internal.models;

import com.metis.opportunity_recommendation_algorithm.internal.models.enums.NodeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private String id;
    private NodeType type; // Agora usa o Enum correto em vez de String
}