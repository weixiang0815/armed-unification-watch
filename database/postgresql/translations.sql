CREATE TABLE translations (
    id UUID PRIMARY KEY,
    table_name TEXT,
    record_id UUID,
    language TEXT,
    field_name TEXT,
    translated_text TEXT
);