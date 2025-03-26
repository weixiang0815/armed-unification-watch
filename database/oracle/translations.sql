CREATE TABLE translations (
    id RAW(16) PRIMARY KEY,
    table_name NVARCHAR2(100),
    record_id RAW(16),
    language NVARCHAR2(10),
    field_name NVARCHAR2(100),
    translated_text CLOB
);