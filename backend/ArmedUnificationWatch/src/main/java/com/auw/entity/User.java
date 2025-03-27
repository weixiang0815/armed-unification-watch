package com.auw.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "id", columnDefinition = "uniqueidentifier")
	private UUID id;

	@Column(name = "email", length = 255, nullable = false)
	private String email;

	@Column(name = "password_hash", columnDefinition = "nvarchar(max)", nullable = false)
	private String passwordHash;

	@Column(name = "role", length = 50, nullable = false)
	private String role;

	@Column(name = "is_active")
	private Boolean isActive = false;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@OneToMany(mappedBy = "uploadedBy", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Source> uploadedSources = new ArrayList<>();

	@PrePersist
	protected void onCreate() {
		this.createdAt = LocalDateTime.now();
		if (this.id == null)
			this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public List<Source> getUploadedSources() {
		return uploadedSources;
	}

	public void setUploadedSources(List<Source> uploadedSources) {
		this.uploadedSources = uploadedSources;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", email=");
		builder.append(email);
		builder.append(", passwordHash=");
		builder.append(passwordHash);
		builder.append(", role=");
		builder.append(role);
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append("]");
		return builder.toString();
	}

}
