package com.knowledge.graph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableNeo4jRepositories(basePackages = "com.knowledge.graph.repository")
@EntityScan(basePackages = "com.knowledge.graph.entity")
public class KnowledgeGraphApplication {
    public static void main(String[] args) {
        SpringApplication.run(KnowledgeGraphApplication.class);
    }
}
