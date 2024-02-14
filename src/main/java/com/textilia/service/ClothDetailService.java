package com.textilia.service;

import com.textilia.model.dto.ClothDetailRequestDTO;
import com.textilia.model.dto.ClothDetailResponseDTO;

import java.util.List;

public interface ClothDetailService {

    List<ClothDetailResponseDTO> addClothDetail(ClothDetailRequestDTO clothDetailDTO);
}
