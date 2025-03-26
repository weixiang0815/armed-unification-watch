CREATE TABLE tags (
    id RAW(16) PRIMARY KEY,
    name NVARCHAR2(255) NOT NULL,
    description CLOB,
    color NVARCHAR2(20)
);