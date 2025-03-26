CREATE TABLE sources (
    id RAW(16) PRIMARY KEY,
    statement_id RAW(16),
    type NVARCHAR2(50),
    file_url NVARCHAR2(2000),
    uploaded_by RAW(16),
    uploaded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_sources_statement FOREIGN KEY (statement_id) REFERENCES statements(id) ON DELETE CASCADE
);