package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auw.entity.SourceEntity;

public interface SourceRepository extends JpaRepository<SourceEntity, UUID> {

}
