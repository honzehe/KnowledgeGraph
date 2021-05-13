package com.knowledge.graph.controller;

import com.knowledge.graph.entity.Entity1;
import com.knowledge.graph.service.Entity1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
控制层与前端交互
 */
@RestController
public class Entity1Controller {

    @Autowired
    private Entity1Service entity1Service;

    //前端发送请求获取标签为Entity1的所有结点信息
    @GetMapping("/getAllEntity1")
    public List<Entity1> getAllEntity1(){
        List<Entity1> R = entity1Service.getAllEntity1();
        System.out.println(R);
        return R;
    }
}
