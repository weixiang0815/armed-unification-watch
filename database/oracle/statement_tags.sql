CREATE TABLE statement_tags (
    statement_id RAW(16),
    tag_id RAW(16),
    PRIMARY KEY (statement_id, tag_id),
    CONSTRAINT fk_statement FOREIGN KEY (statement_id) REFERENCES statements(id) ON DELETE CASCADE,
    CONSTRAINT fk_tag FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
);