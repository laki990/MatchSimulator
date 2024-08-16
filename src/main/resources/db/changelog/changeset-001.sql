-- changeset lazar:001: create team table
CREATE TABLE team (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- changeset lazar:001: add unique constraint to team name
ALTER TABLE team ADD CONSTRAINT UK_team_name UNIQUE (name);

-- changeset lazar:001: create player table
CREATE TABLE player (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    position VARCHAR(50),
    ranking INT,
    team_id BIGINT,
    FOREIGN KEY (team_id) REFERENCES team (id)
);
