CREATE TABLE statement_tags (
    statement_id UUID REFERENCES statements(id) ON DELETE CASCADE,
    tag_id UUID REFERENCES tags(id) ON DELETE CASCADE,
    PRIMARY KEY (statement_id, tag_id)
);