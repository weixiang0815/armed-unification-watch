package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auw.entity.StatementEntity;

public interface StatementRepository extends JpaRepository<StatementEntity, UUID> {

}
