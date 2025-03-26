CREATE TABLE users (
    id UNIQUEIDENTIFIER PRIMARY KEY,
    email NVARCHAR(255) NOT NULL UNIQUE,
    password_hash NVARCHAR(MAX) NOT NULL,
    role NVARCHAR(50) CHECK (role IN ('管理員', '審查員', '投稿者')) NOT NULL,
    is_active BIT DEFAULT 1,
    created_at DATETIME2 DEFAULT SYSUTCDATETIME()
);