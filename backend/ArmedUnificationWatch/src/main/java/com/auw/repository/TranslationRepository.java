package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auw.entity.TranslationEntity;

public interface TranslationRepository extends JpaRepository<TranslationEntity, UUID> {

}
