package com.knowledge.graph.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

@Data
@Builder
@Node
public class Entity2{

    @Id
    @GeneratedValue
    private Long id;

    @Property("name")
    private String name;

    @Relationship(type = "attribute_of", direction = Relationship.Direction.OUTGOING)
    private List<Entity1> AttributeOf;

    @Relationship(type = "is", direction = Relationship.Direction.OUTGOING)
    private List<Entity1> Is;

    @Relationship(type = "part_of", direction = Relationship.Direction.OUTGOING)
    private List<Entity1> PartOf;
}
