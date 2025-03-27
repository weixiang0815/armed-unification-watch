package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auw.entity.IndividualEntity;

public interface IndividualRepository extends JpaRepository<IndividualEntity, UUID> {

}
