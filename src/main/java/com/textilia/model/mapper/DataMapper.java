package com.textilia.model.mapper;

import com.textilia.model.dto.ClothDetailResponseDTO;
import com.textilia.model.entity.ClothDetail;
import org.mapstruct.Mapper;

@Mapper
public interface DataMapper {

    ClothDetailResponseDTO toClothDetailResponse(ClothDetail clothDetail);
}
