package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auw.entity.TagEntity;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, UUID> {

}
