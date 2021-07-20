package com.knowledge.graph.node;

import java.util.List;

public class EndNodeWithRelationship {
    private List<BIMNode> endNodes;
    private List<RelationshipNode> relationshipNodes;

    public EndNodeWithRelationship() {
    }

    public EndNodeWithRelationship(List<BIMNode> endNodes, List<RelationshipNode> relationshipNodes) {
        this.endNodes = endNodes;
        this.relationshipNodes = relationshipNodes;
    }

    public List<BIMNode> getEndNodes() {
        return endNodes;
    }

    public void setEndNodes(List<BIMNode> endNodes) {
        this.endNodes = endNodes;
    }

    public List<RelationshipNode> getRelationshipNodes() {
        return relationshipNodes;
    }

    public void setRelationshipNodes(List<RelationshipNode> relationshipNodes) {
        this.relationshipNodes = relationshipNodes;
    }
}
