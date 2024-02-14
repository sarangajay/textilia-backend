package com.textilia.service;

import com.textilia.model.dto.ClothDetailRequestDTO;
import com.textilia.model.dto.ClothDetailResponseDTO;
import com.textilia.model.entity.ClothDetail;
import com.textilia.model.mapper.DataMapper;
import com.textilia.repository.ClothDetailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClothDetailServiceImpl implements ClothDetailService {

    private final ClothDetailRepository clothDetailRepository;

    private final DataMapper dataMapper;

    @Override
    public List<ClothDetailResponseDTO> addClothDetail(ClothDetailRequestDTO clothDetailDTO) {

        ClothDetail clothDetail = ClothDetail.builder()
                .name(clothDetailDTO.name())
                .size(clothDetailDTO.size())
                .color(clothDetailDTO.color())
                .createdTimestamp(LocalDate.now())
                .updatedTimestamp(LocalDate.now())
                .build();

        clothDetailRepository.save(clothDetail);

        return clothDetailRepository.findAll()
                .stream()
                .map(dataMapper::toClothDetailResponse)
                .collect(Collectors.toList());
    }
}
