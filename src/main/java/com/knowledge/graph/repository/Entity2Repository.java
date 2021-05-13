package com.knowledge.graph.repository;

import com.knowledge.graph.entity.Entity2;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity2Repository extends Neo4jRepository<Entity2, Long> {
}
