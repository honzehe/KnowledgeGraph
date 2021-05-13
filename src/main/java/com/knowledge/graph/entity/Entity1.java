package com.knowledge.graph.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/*
实体类1，对应于neo4j数据库 label="Entity1"的数据
 */

@Data
@Builder
@Node
public class Entity1{

    @Id
    @GeneratedValue
    private Long id; // neo4j数据库自带的主键

    @Property("name")
    private String name; //结点的属性值
}
