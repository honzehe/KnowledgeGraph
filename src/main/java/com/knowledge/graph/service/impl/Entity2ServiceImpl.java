package com.knowledge.graph.service.impl;

import com.knowledge.graph.entity.Entity1;
import com.knowledge.graph.entity.Entity2;
import com.knowledge.graph.repository.Entity1Repository;
import com.knowledge.graph.repository.Entity2Repository;
import com.knowledge.graph.service.Entity1Service;
import com.knowledge.graph.service.Entity2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Entity2Service")
public class Entity2ServiceImpl implements Entity2Service {

    @Autowired
    private Entity2Repository entity2Repository;

    @Autowired
    private Entity1Repository entity1Repository;

    @Override
    public List<Entity2> getAllEntity2() {
        return entity2Repository.findAll();
    }

    @Override
    public void addEntity2(Entity2 entity2) {
        entity2Repository.save(entity2);
    }

    @Override
    public void addAttributeRelationship(Long sId, List<Long> tId) {
        Entity2 SourceEntity2 = entity2Repository.findById(sId).get();
        List<Entity1> TargetEntity1 = entity1Repository.findAllById(tId);
        List<Entity1> attributeOf = SourceEntity2.getAttributeOf();
        for(Entity1 entity1 : TargetEntity1){
            attributeOf.add(entity1);
        }
        entity2Repository.save(SourceEntity2);
    }
}
