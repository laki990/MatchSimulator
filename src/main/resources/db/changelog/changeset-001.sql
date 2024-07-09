-- changeset lazar:001: create team table
CREATE TABLE team (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    founded DATE,
    PRIMARY KEY (id)
);

-- changeset lazar:001: add unique constraint to team name
ALTER TABLE team ADD CONSTRAINT UK_team_name UNIQUE (name);