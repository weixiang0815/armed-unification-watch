CREATE TABLE review_logs (
    id CHAR(36) PRIMARY KEY,
    statement_id CHAR(36),
    user_id CHAR(36),
    action ENUM('標註為支持武統', '標註為威脅性言論', '移除標籤', '確認來源'),
    notes TEXT,
    reviewed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (statement_id) REFERENCES statements(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE SET NULL
);