package com.knowledge.graph.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;


@Data
@Builder
@Node
public class Entity1{

    @Id
    @GeneratedValue
    private Long id;

    @Property("name")
    private String name;
}
