INSERT INTO role (id, nom) VALUES (1, 'STANDARD_USER');
INSERT INTO role (id, nom) VALUES (2, 'ADMIN_USER');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO Utilisateur (id, email, is_deleted, prenom, nom, password, username, id_role) VALUES (1, 'amaury.lapaque@gmail.com', '0', 'Amaury', 'Lapaque', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin', '2');
INSERT INTO Utilisateur (id, email, is_deleted, prenom, nom, password, username, id_role) VALUES (2, 'lucas.robyns@gmail.com', '0', 'Lucas', 'Robyns', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'lucas.robyns', '1');