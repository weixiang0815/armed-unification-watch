CREATE TABLE review_logs (
    id RAW(16) PRIMARY KEY,
    statement_id RAW(16),
    user_id RAW(16),
    action NVARCHAR2(100),
    notes CLOB,
    reviewed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_review_statement FOREIGN KEY (statement_id) REFERENCES statements(id) ON DELETE CASCADE,
    CONSTRAINT fk_review_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE SET NULL
);