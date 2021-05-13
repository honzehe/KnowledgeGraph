package com.knowledge.graph.service.impl;

import com.knowledge.graph.entity.Entity1;
import com.knowledge.graph.repository.Entity1Repository;
import com.knowledge.graph.service.Entity1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Entity1Service")
public class Entity1ServiceImpl implements Entity1Service {

    @Autowired
    private Entity1Repository entity1Repository;

    @Override
    public List<Entity1> getAllEntity1() {
        return entity1Repository.findAll();
    }
}
