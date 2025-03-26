CREATE TABLE review_logs (
    id UNIQUEIDENTIFIER PRIMARY KEY,
    statement_id UNIQUEIDENTIFIER FOREIGN KEY REFERENCES statements(id) ON DELETE CASCADE,
    user_id UNIQUEIDENTIFIER FOREIGN KEY REFERENCES users(id) ON DELETE SET NULL,
    action NVARCHAR(100) CHECK (action IN ('標註為支持武統', '標註為威脅性言論', '移除標籤', '確認來源')),
    notes NVARCHAR(MAX),
    reviewed_at DATETIME2 DEFAULT SYSUTCDATETIME()
);