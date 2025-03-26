CREATE TABLE statements (
    id UUID PRIMARY KEY,
    individual_id UUID REFERENCES individuals(id) ON DELETE CASCADE,
    content TEXT NOT NULL,
    language TEXT,
    platform TEXT,
    url TEXT,
    statement_type TEXT CHECK (statement_type IN ('影片', '貼文', '留言', '群組對話')),
    is_pro_unification BOOLEAN,
    is_threatening BOOLEAN,
    sentiment_score FLOAT,
    statement_time TIMESTAMP,
    recorded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);