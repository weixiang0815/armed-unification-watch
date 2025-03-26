CREATE TABLE statements (
    id RAW(16) PRIMARY KEY,
    individual_id RAW(16),
    content CLOB NOT NULL,
    language NVARCHAR2(50),
    platform NVARCHAR2(100),
    url NVARCHAR2(2000),
    statement_type NVARCHAR2(50),
    is_pro_unification NUMBER(1),
    is_threatening NUMBER(1),
    sentiment_score BINARY_FLOAT,
    statement_time TIMESTAMP,
    recorded_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_statements_individual FOREIGN KEY (individual_id) REFERENCES individuals(id) ON DELETE CASCADE
);