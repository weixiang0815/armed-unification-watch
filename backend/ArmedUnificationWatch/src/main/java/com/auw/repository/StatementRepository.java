package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auw.entity.StatementEntity;

@Repository
public interface StatementRepository extends JpaRepository<StatementEntity, UUID> {

}
