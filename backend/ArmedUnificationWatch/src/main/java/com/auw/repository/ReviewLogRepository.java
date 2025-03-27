package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auw.entity.ReviewLogEntity;

public interface ReviewLogRepository extends JpaRepository<ReviewLogEntity, UUID> {

}
