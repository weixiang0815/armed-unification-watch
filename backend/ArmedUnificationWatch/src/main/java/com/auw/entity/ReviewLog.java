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
@Table
public class ReviewLog {

	@Id
	@Column(name = "id", columnDefinition = "uniqueidentifier")
	private UUID id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "statement_id", nullable = false)
	private Statement statement;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@Column(name = "action", length = 100)
	private String action;

	@Column(name = "notes", columnDefinition = "nvarchar(max)")
	private String notes;

	@Column(name = "reviewed_at")
	private LocalDateTime reviewedAt;

	@PrePersist
	protected void onCreate() {
		this.reviewedAt = LocalDateTime.now();
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public LocalDateTime getReviewedAt() {
		return reviewedAt;
	}

	public void setReviewedAt(LocalDateTime reviewedAt) {
		this.reviewedAt = reviewedAt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReviewLog [id=");
		builder.append(id);
		builder.append(", statement=");
		builder.append(statement);
		builder.append(", user=");
		builder.append(user);
		builder.append(", action=");
		builder.append(action);
		builder.append(", notes=");
		builder.append(notes);
		builder.append(", reviewedAt=");
		builder.append(reviewedAt);
		builder.append("]");
		return builder.toString();
	}

}
