package com.knowledge.graph.controller;


import com.knowledge.graph.entity.Entity2;
import com.knowledge.graph.service.Entity2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Entity2Controller {

    @Autowired
    private Entity2Service entity2Service;

    @GetMapping("/getAllEntity2")
    public List<Entity2> getAllEntity2(){
        return entity2Service.getAllEntity2();
    }
}
