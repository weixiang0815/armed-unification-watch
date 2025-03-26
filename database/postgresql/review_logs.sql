CREATE TABLE review_logs (
    id UUID PRIMARY KEY,
    statement_id UUID REFERENCES statements(id) ON DELETE CASCADE,
    user_id UUID REFERENCES users(id) ON DELETE SET NULL,
    action TEXT CHECK (action IN ('標註為支持武統', '標註為威脅性言論', '移除標籤', '確認來源')),
    notes TEXT,
    reviewed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);