package com.knowledge.graph.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

/*
实体类2 对应于neo4j数据库中 label="Entity2"的结点
 */

@Data
@Node
public class Entity2{
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Entity1> getAttributeOf() {
        return AttributeOf;
    }

    public void setAttributeOf(List<Entity1> attributeOf) {
        AttributeOf = attributeOf;
    }

    public List<Entity1> getIs() {
        return Is;
    }

    public void setIs(List<Entity1> is) {
        Is = is;
    }

    public List<Entity1> getPartOf() {
        return PartOf;
    }

    public void setPartOf(List<Entity1> partOf) {
        PartOf = partOf;
    }

    @Override
    public String toString() {
        return "Entity2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", AttributeOf=" + AttributeOf +
                ", Is=" + Is +
                ", PartOf=" + PartOf +
                '}';
    }

    @Id
    @GeneratedValue
    private Long id;

    @Property("name")
    private String name; //结点的属性值

    // 结点2 ------> 结点1 关系为 attribute_of 的所有结点1
    @Relationship(type = "attribute_of", direction = Relationship.Direction.OUTGOING)
    private List<Entity1> AttributeOf;

    // 结点2 ------> 结点1 关系为 is 的所有结点1
    @Relationship(type = "is", direction = Relationship.Direction.OUTGOING)
    private List<Entity1> Is;

    // 结点2 ------> 结点1 关系为 part_of 的所有结点1
    @Relationship(type = "part_of", direction = Relationship.Direction.OUTGOING)
    private List<Entity1> PartOf;
}
