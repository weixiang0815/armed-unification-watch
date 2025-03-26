CREATE TABLE statement_tags (
    statement_id UNIQUEIDENTIFIER,
    tag_id UNIQUEIDENTIFIER,
    PRIMARY KEY (statement_id, tag_id),
    FOREIGN KEY (statement_id) REFERENCES statements(id) ON DELETE CASCADE,
    FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
);