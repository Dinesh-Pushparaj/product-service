package com.dinesh.microservices.productservice.dto;

import java.math.BigDecimal;

public record ProductResponse(String id, String name, String description, BigDecimal price) {
    // This record class is used to encapsulate product response data
    // It includes fields for id, name, description, and price
    // Lombok annotations are not needed here as records automatically generate getters and constructors
}
