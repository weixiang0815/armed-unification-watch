CREATE TABLE individuals (
    id UUID PRIMARY KEY,
    name TEXT NOT NULL,
    alias TEXT,
    nationality_status TEXT CHECK (nationality_status IN ('未入籍外籍配偶', '已入籍外籍人士', '天然本國人')),
    country_of_origin TEXT,
    residency_status TEXT,
    social_links JSONB,
    is_verified BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);