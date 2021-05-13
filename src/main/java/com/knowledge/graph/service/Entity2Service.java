package com.knowledge.graph.service;

import com.knowledge.graph.entity.Entity2;

import java.util.List;

public interface Entity2Service {
    public List<Entity2> getAllEntity2();

    public void addEntity2(Entity2 entity2);

    public void addAttributeRelationship(Long sId, List<Long> tId);
}
