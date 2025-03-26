CREATE TABLE sources (
    id CHAR(36) PRIMARY KEY,
    statement_id CHAR(36),
    type ENUM('截圖', '影片連結', 'PDF', '音檔'),
    file_url TEXT,
    uploaded_by CHAR(36),
    uploaded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (statement_id) REFERENCES statements(id) ON DELETE CASCADE
);