package com.auw.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "translations")
public class TranslationEntity {

	@Id
	@Column(name = "id", columnDefinition = "uniqueidentifier")
	private UUID id;

	@Column(name = "table_name", length = 100)
	private String tableName;

	@Column(name = "record_id", columnDefinition = "uniqueidentifier")
	private UUID recordId;

	@Column(name = "language", length = 10)
	private String language;

	@Column(name = "field_name", length = 100)
	private String fieldName;

	@Column(name = "translated_text", columnDefinition = "nvarchar(max)")
	private String translatedText;

	@PrePersist
	protected void onCreate() {
		if (this.id == null)
			this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public UUID getRecordId() {
		return recordId;
	}

	public void setRecordId(UUID recordId) {
		this.recordId = recordId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getTranslatedText() {
		return translatedText;
	}

	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Translation [id=");
		builder.append(id);
		builder.append(", tableName=");
		builder.append(tableName);
		builder.append(", recordId=");
		builder.append(recordId);
		builder.append(", language=");
		builder.append(language);
		builder.append(", fieldName=");
		builder.append(fieldName);
		builder.append(", translatedText=");
		builder.append(translatedText);
		builder.append("]");
		return builder.toString();
	}

}
