package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auw.entity.IndividualEntity;

@Repository
public interface IndividualRepository extends JpaRepository<IndividualEntity, UUID> {

}
