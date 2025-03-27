package com.auw.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "statements")
public class Statement {

	@Id
	@Column(name = "id", columnDefinition = "uniqueidentifier")
	private UUID id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "individual_id", nullable = false)
	private Individual individual;

	@Column(name = "content", columnDefinition = "nvarchar(max)", nullable = false)
	private String content;

	@Column(name = "language", length = 50)
	private String language;

	@Column(name = "platform", length = 100)
	private String platform;

	@Column(name = "url", columnDefinition = "nvarchar(max)")
	private String url;

	@Column(name = "statement_type", length = 50)
	private String statementType;

	@Column(name = "is_pro_unification")
	private Boolean isProUnification;

	@Column(name = "is_threatening")
	private Boolean isThreatening;

	@Column(name = "sentiment_score")
	private Double sentimentScore;

	@Column(name = "statement_time")
	private LocalDateTime statementTime;

	@Column(name = "recorded_at")
	private LocalDateTime recordedAt;

	@OneToMany(mappedBy = "statement", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Source> sources = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "statement_tags", joinColumns = @JoinColumn(name = "statement_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
	private Set<Tag> tags = new HashSet<>();

	@PrePersist
	protected void onCreate() {
		if (this.id == null)
			this.id = UUID.randomUUID();
		this.recordedAt = LocalDateTime.now();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Individual getIndividual() {
		return individual;
	}

	public void setIndividual(Individual individual) {
		this.individual = individual;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatementType() {
		return statementType;
	}

	public void setStatementType(String statementType) {
		this.statementType = statementType;
	}

	public Boolean getIsProUnification() {
		return isProUnification;
	}

	public void setIsProUnification(Boolean isProUnification) {
		this.isProUnification = isProUnification;
	}

	public Boolean getIsThreatening() {
		return isThreatening;
	}

	public void setIsThreatening(Boolean isThreatening) {
		this.isThreatening = isThreatening;
	}

	public Double getSentimentScore() {
		return sentimentScore;
	}

	public void setSentimentScore(Double sentimentScore) {
		this.sentimentScore = sentimentScore;
	}

	public LocalDateTime getStatementTime() {
		return statementTime;
	}

	public void setStatementTime(LocalDateTime statementTime) {
		this.statementTime = statementTime;
	}

	public LocalDateTime getRecordedAt() {
		return recordedAt;
	}

	public void setRecordedAt(LocalDateTime recordedAt) {
		this.recordedAt = recordedAt;
	}

	public List<Source> getSources() {
		return sources;
	}

	public void setSources(List<Source> sources) {
		this.sources = sources;
	}

	public Set<Tag> getTags() {
		return tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Statement [id=");
		builder.append(id);
		builder.append(", individual=");
		builder.append(individual);
		builder.append(", content=");
		builder.append(content);
		builder.append(", language=");
		builder.append(language);
		builder.append(", platform=");
		builder.append(platform);
		builder.append(", url=");
		builder.append(url);
		builder.append(", statementType=");
		builder.append(statementType);
		builder.append(", isProUnification=");
		builder.append(isProUnification);
		builder.append(", isThreatening=");
		builder.append(isThreatening);
		builder.append(", sentimentScore=");
		builder.append(sentimentScore);
		builder.append(", statementTime=");
		builder.append(statementTime);
		builder.append(", recordedAt=");
		builder.append(recordedAt);
		builder.append("]");
		return builder.toString();
	}

}
