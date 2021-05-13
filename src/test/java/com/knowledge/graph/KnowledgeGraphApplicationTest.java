package com.knowledge.graph;

import com.knowledge.graph.service.Entity1Service;
import com.knowledge.graph.service.Entity2Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = KnowledgeGraphApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KnowledgeGraphApplicationTest {


    @Autowired
    Entity1Service entity1Service;

    @Autowired
    Entity2Service entity2Service;

    @Test
    void contextLoads() {
        System.out.println(entity2Service.getAllEntity2());
        System.out.println("查询成功");
    }
}
