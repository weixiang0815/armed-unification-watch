CREATE TABLE individuals (
    id RAW(16) PRIMARY KEY,
    name NVARCHAR2(255) NOT NULL,
    alias NVARCHAR2(255),
    nationality_status NVARCHAR2(50),
    country_of_origin NVARCHAR2(255),
    residency_status NVARCHAR2(255),
    social_links CLOB,
    is_verified NUMBER(1) DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);