package com.auw.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auw.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
