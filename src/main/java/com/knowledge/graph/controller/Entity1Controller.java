package com.knowledge.graph.controller;

import com.knowledge.graph.entity.Entity1;
import com.knowledge.graph.entity.Response;
import com.knowledge.graph.service.Entity1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Response getAllEntity1(){
        List<Entity1> entity1s = entity1Service.getAllEntity1();
        if(entity1s != null){
            return Response.ok("查找数据成功", entity1s);
        }
        return Response.error("查找数据失败");
    }

    @PostMapping("/AddEntity1")
    public Response AddEntity1(@RequestBody Entity1 entity1){
        entity1Service.addEntity1(entity1);
        return Response.ok("添加结点成功");
    }
}
