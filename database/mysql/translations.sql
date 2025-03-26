CREATE TABLE translations (
    id CHAR(36) PRIMARY KEY,
    table_name TEXT,
    record_id CHAR(36),
    language TEXT,
    field_name TEXT,
    translated_text TEXT
);