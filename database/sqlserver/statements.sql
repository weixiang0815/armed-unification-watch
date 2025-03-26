CREATE TABLE statements (
    id UNIQUEIDENTIFIER PRIMARY KEY,
    individual_id UNIQUEIDENTIFIER FOREIGN KEY REFERENCES individuals(id) ON DELETE CASCADE,
    content NVARCHAR(MAX) NOT NULL,
    language NVARCHAR(50),
    platform NVARCHAR(100),
    url NVARCHAR(MAX),
    statement_type NVARCHAR(50) CHECK (statement_type IN ('影片', '貼文', '留言', '群組對話')),
    is_pro_unification BIT,
    is_threatening BIT,
    sentiment_score FLOAT,
    statement_time DATETIME2,
    recorded_at DATETIME2 DEFAULT SYSUTCDATETIME()
);