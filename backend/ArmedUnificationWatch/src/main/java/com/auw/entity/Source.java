package com.auw.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "sources")
public class Source {

	@Id
	@Column(name = "id", columnDefinition = "uniqueidentifier")
	private UUID id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "statement_id", nullable = false)
	private Statement statement;

	@Column(name = "type", length = 50)
	private String type;

	@Column(name = "file_url", columnDefinition = "nvarchar(max)")
	private String file_url;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uploaded_by", nullable = false)
	private User uploadedBy;

	@Column(name = "uploaded_at")
	private LocalDateTime uploadedAt;

	@PrePersist
	protected void onCreate() {
		this.uploadedAt = LocalDateTime.now();
		if (this.id == null)
			this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFile_url() {
		return file_url;
	}

	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}

	public User getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(User uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(LocalDateTime uploadedAt) {
		this.uploadedAt = uploadedAt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Source [id=");
		builder.append(id);
		builder.append(", statement=");
		builder.append(statement);
		builder.append(", type=");
		builder.append(type);
		builder.append(", file_url=");
		builder.append(file_url);
		builder.append(", uploadedBy=");
		builder.append(uploadedBy);
		builder.append(", uploadedAt=");
		builder.append(uploadedAt);
		builder.append("]");
		return builder.toString();
	}

}
