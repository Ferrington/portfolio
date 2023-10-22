INSERT INTO roles (name)
VALUES ('ROLE_ADMIN')
ON CONFLICT (name) DO NOTHING;

INSERT INTO users (username, password)
VALUES
    ('christopher' ,'$2a$10$VngJe1.o4n4eyyLymh9YVeOTtuQFyzPnAjSXX24cuTxST9EroEBJO')
ON CONFLICT (username) DO NOTHING;

INSERT INTO user_roles (user_id, role_id)
VALUES
    ((SELECT id FROM users WHERE username = 'christopher'), (SELECT id FROM roles WHERE name = 'ROLE_ADMIN'))
ON CONFLICT (user_id, role_id) DO NOTHING;

INSERT INTO projects (name, url, description)
VALUES
    ('Ladder Learner', 'https://ladderlearner.com', 'Learn ladder logic!'),
    ('Sodoku Solver', 'test.com', 'It solves sodoku puzzles.'),
    ('Trouble', 'github.com', 'It''s the board game Trouble in the terminal.')