CREATE TABLE statements (
    id CHAR(36) PRIMARY KEY,
    individual_id CHAR(36),
    content TEXT NOT NULL,
    language TEXT,
    platform TEXT,
    url TEXT,
    statement_type ENUM('影片', '貼文', '留言', '群組對話'),
    is_pro_unification BOOLEAN,
    is_threatening BOOLEAN,
    sentiment_score FLOAT,
    statement_time TIMESTAMP,
    recorded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (individual_id) REFERENCES individuals(id) ON DELETE CASCADE
);