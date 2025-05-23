-- CREATE TABLE IF NOT EXISTS membre (
--   id BIGINT AUTO_INCREMENT PRIMARY KEY,
--   nom VARCHAR(100),
--   prenom VARCHAR(100),
--   date_naissance DATE,
--   a_vote BOOLEAN
-- );
DELETE FROM membre;

INSERT INTO membre (nom, prenom, date_naissance, a_vote) VALUES
('Alice', 'Dupont', '1990-05-12', false),
('Jean', 'Martin', '1988-10-01', false),
('Chloé', 'Durand', '1992-03-25', false);
