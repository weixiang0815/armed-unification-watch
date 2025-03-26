CREATE TABLE individuals (
    id UNIQUEIDENTIFIER PRIMARY KEY,
    name NVARCHAR(MAX) NOT NULL,
    alias NVARCHAR(MAX),
    nationality_status NVARCHAR(50) CHECK (nationality_status IN ('未入籍外籍配偶', '已入籍外籍人士', '天然本國人')),
    country_of_origin NVARCHAR(MAX),
    residency_status NVARCHAR(MAX),
    social_links NVARCHAR(MAX), -- SQL Server 沒有 JSON 類型，使用 NVARCHAR 儲存
    is_verified BIT DEFAULT 0,
    created_at DATETIME2 DEFAULT SYSUTCDATETIME(),
    updated_at DATETIME2 DEFAULT SYSUTCDATETIME()
);