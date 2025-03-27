package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auw.entity.TranslationEntity;

@Repository
public interface TranslationRepository extends JpaRepository<TranslationEntity, UUID> {

}
