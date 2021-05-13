package com.knowledge.graph.repository;

import com.knowledge.graph.entity.Entity1;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity1Repository extends Neo4jRepository<Entity1, Long> {
}
