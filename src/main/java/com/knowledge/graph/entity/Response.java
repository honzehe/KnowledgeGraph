package com.knowledge.graph.entity;

import lombok.Data;

@Data
public class Response {
    private Integer status;
    private String message;
    private Object data;

    private Response(Integer status, String message, Object data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static Response ok(String message) {
        return new Response(200, message, null);
    }

    public static Response ok(String message, Object data) {
        return new Response(200, message, data);
    }

    public static Response error(String message) {
        return new Response(500, message, null);
    }

    public static Response error(String message, Object data) {
        return new Response(500, message, data);
    }

}