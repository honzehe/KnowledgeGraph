package com.knowledge.graph.service.impl;

import com.knowledge.graph.entity.Entity2;
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

    @Override
    public List<Entity2> getAllEntity2() {
        return entity2Repository.findAll();
    }
}
