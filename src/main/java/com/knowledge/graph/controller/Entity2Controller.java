package com.knowledge.graph.controller;


import com.knowledge.graph.entity.Entity2;
import com.knowledge.graph.entity.Response;
import com.knowledge.graph.service.Entity2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Entity2Controller {

    @Autowired
    private Entity2Service entity2Service;

    @GetMapping("/getAllEntity2")
    public Response getAllEntity2(){
        List<Entity2> allEntity2 = entity2Service.getAllEntity2();
        if(allEntity2 != null){
            return Response.ok("查询所有结点成功",allEntity2);
        }
        return Response.error("查询结点失败");
    }

    @PostMapping("/addEntity2")
    public Response addEntity2(Entity2 entity2){
        entity2Service.addEntity2(entity2);
        return Response.ok("添加结点成功");
    }

    public Response addAttributeRelationship(Long sId, List<Long> tId){
        entity2Service.addAttributeRelationship(sId,tId);
        return Response.ok("添加关系成功");
    }
}
