INSERT INTO `users` (username, password, enabled, name, lastname, email) VALUES ('jorge', '12345', 1, 'Jorge', 'Figueroa', 'jorgef1987@gmail.com');
INSERT INTO `users` (username, password, enabled, name, lastname, email) VALUES ('duque', '12345', 1, 'Duque', 'Figueroa', 'duquelino22@gmail.com');

INSERT INTO `role` (name) VALUES ('ROLE_USER');
INSERT INTO `role` (name) VALUES ('ROLE_ADMIN');

INSERT INTO `users_role` (user_id, role_id) VALUES (1,1);
INSERT INTO `users_role` (user_id, role_id) VALUES (2,2);
INSERT INTO `users_role` (user_id, role_id) VALUES (2,1);
