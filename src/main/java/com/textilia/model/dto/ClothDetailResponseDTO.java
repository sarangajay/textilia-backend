package com.textilia.model.dto;

import java.time.LocalDate;

public record ClothDetailResponseDTO(Long id,
                                     String name,
                                     String size,
                                     String color,
                                     LocalDate createdTimestamp,
                                     LocalDate updatedTimestamp) {
}
