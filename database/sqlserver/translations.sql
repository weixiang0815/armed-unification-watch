CREATE TABLE translations (
    id UNIQUEIDENTIFIER PRIMARY KEY,
    table_name NVARCHAR(100),
    record_id UNIQUEIDENTIFIER,
    language NVARCHAR(10),
    field_name NVARCHAR(100),
    translated_text NVARCHAR(MAX)
);