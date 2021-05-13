package com.knowledge.graph;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = KnowledgeGraphApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KnowledgeGraphApplicationTest {


    @Test
    public void test(){
            System.out.println("查询成功");
    }
}
