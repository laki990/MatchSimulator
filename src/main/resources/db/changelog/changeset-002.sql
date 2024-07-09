-- changeset lazar:002: create player table
CREATE TABLE player (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    position VARCHAR(50),
    ranking INT,
    team_id BIGINT NOT NULL,
    FOREIGN KEY (team_id) REFERENCES team (id)
);
