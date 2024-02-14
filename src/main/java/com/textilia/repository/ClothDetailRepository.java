package com.textilia.repository;

import com.textilia.model.entity.ClothDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothDetailRepository extends JpaRepository<ClothDetail, Long> {

}