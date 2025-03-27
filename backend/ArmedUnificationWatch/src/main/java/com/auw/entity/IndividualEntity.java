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
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "individuals")
public class IndividualEntity {

	@Id
	@Column(name = "id", columnDefinition = "uniqueidentifier")
	private UUID id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "alias")
	private String alias;

	@Column(name = "nationality_state", length = 50)
	private String nationalityState;

	@Column(name = "country_of_origin")
	private String countryOfOrigin;

	@Column(name = "residency_status")
	private String residencyStatus;

	@Column(name = "social_links", columnDefinition = "nvarchar(max)")
	private String socialLinks;

	@Column(name = "is_verified")
	private Boolean isVerified;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@OneToMany(mappedBy = "individual", cascade = CascadeType.ALL, orphanRemoval = true)
	List<StatementEntity> statements = new ArrayList<>();

	@PrePersist
	protected void onCreate() {
		this.createdAt = LocalDateTime.now();
		this.updatedAt = this.createdAt;
		if (this.id == null)
			this.id = UUID.randomUUID();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = LocalDateTime.now();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getNationalityState() {
		return nationalityState;
	}

	public void setNationalityState(String nationalityState) {
		this.nationalityState = nationalityState;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getResidencyStatus() {
		return residencyStatus;
	}

	public void setResidencyStatus(String residencyStatus) {
		this.residencyStatus = residencyStatus;
	}

	public String getSocialLinks() {
		return socialLinks;
	}

	public void setSocialLinks(String socialLinks) {
		this.socialLinks = socialLinks;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<StatementEntity> getStatements() {
		return statements;
	}

	public void setStatements(List<StatementEntity> statements) {
		this.statements = statements;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Individual [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", alias=");
		builder.append(alias);
		builder.append(", nationalityState=");
		builder.append(nationalityState);
		builder.append(", countryOfOrigin=");
		builder.append(countryOfOrigin);
		builder.append(", residencyStatus=");
		builder.append(residencyStatus);
		builder.append(", socialLinks=");
		builder.append(socialLinks);
		builder.append(", isVerified=");
		builder.append(isVerified);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", updatedAt=");
		builder.append(updatedAt);
		builder.append("]");
		return builder.toString();
	}

}
