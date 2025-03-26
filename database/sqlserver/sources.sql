CREATE TABLE sources (
    id UNIQUEIDENTIFIER PRIMARY KEY,
    statement_id UNIQUEIDENTIFIER FOREIGN KEY REFERENCES statements(id) ON DELETE CASCADE,
    type NVARCHAR(50) CHECK (type IN ('截圖', '影片連結', 'PDF', '音檔')),
    file_url NVARCHAR(MAX),
    uploaded_by UNIQUEIDENTIFIER,
    uploaded_at DATETIME2 DEFAULT SYSUTCDATETIME()
);