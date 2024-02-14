package com.textilia.controller;

import com.textilia.model.dto.ClothDetailRequestDTO;
import com.textilia.model.dto.ClothDetailResponseDTO;
import com.textilia.service.ClothDetailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clothdetails")
@Validated
@Slf4j
@RequiredArgsConstructor
public class ClothDetailController {

    private final ClothDetailService clothDetailService;

    @PostMapping
    public ResponseEntity<List<ClothDetailResponseDTO>> addClothDetail(@RequestBody @Valid ClothDetailRequestDTO clothDetailDTO) {
        log.info("Add cloth details request received. name = {}, size = {}, color = {}",
                clothDetailDTO.name(), clothDetailDTO.size(), clothDetailDTO.color());
        return ResponseEntity.status(HttpStatus.CREATED).body(clothDetailService.addClothDetail(clothDetailDTO));
    }
}
