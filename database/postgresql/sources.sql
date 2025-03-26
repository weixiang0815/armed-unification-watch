CREATE TABLE sources (
    id UUID PRIMARY KEY,
    statement_id UUID REFERENCES statements(id) ON DELETE CASCADE,
    type TEXT CHECK (type IN ('截圖', '影片連結', 'PDF', '音檔')),
    file_url TEXT,
    uploaded_by UUID,
    uploaded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);