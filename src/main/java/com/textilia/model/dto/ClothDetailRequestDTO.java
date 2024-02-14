package com.textilia.model.dto;


import jakarta.validation.constraints.NotEmpty;

public record ClothDetailRequestDTO(@NotEmpty(message = "Cloth name is required") String name,
                                    @NotEmpty(message = "Cloth size is required") String size,
                                    @NotEmpty(message = "Cloth size is required") String color) {
}
