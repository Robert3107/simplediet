INSERT INTO simple_diet.users (account_type, address, email, name, phone_number, postal_code, street, surname)
VALUES (2, 'Kraków', 'abc@abc.pl', 'Jan', '123456789', '33-300', 'Krupnicza 14', 'Kowalski');
INSERT INTO simple_diet.users (account_type, address, email, name, phone_number, postal_code, street, surname)
VALUES (1, 'Warszawa', 'nowa@nowa.pl', 'Adam', '987654321', '12-345', 'Słomiana 10', 'Nowak');
INSERT INTO simple_diet.users (account_type, address, email, name, phone_number, postal_code, street, surname)
VALUES (1, 'Gdańsk', 'brzoza@onet.pl', 'Joanna', '000000000', '10-000', 'Rolnicza 1', 'Brzoza');
INSERT INTO simple_diet.users (account_type, address, email, name, phone_number, postal_code, street, surname)
VALUES (1, 'Wrocław', 'bear@gmail.pl', 'Jakub', '123456789', '12-852', 'Powstańców 2', 'Niedźwiedz');
INSERT INTO simple_diet.users (account_type, address, email, name, phone_number, postal_code, street, surname)
VALUES (3, 'Częstowchowa', 'sylwiabak@gmail.com', 'Sylwia', '456123123', '456879102', 'Miodowa 4', 'Bąk');
INSERT INTO simple_diet.users (name, surname, email, phone_number, address, street, postal_code, account_type)
VALUES ('Robert', 'Jaki', 'robert@gmail.com', '789456123', 'Nowy Sącz', 'Lwoska 8', '12-789', 3);



INSERT INTO simple_diet.metric_body (user_id, age, arm, bmi, body_fat, calf, chest, forearm, height, hips,
                                     metabolism, neck, sex, stomach, thigh, waits, weight)
VALUES (1, 18, 50, 20, 23, 40, 45, 65, 26, 45, 32, 12, 'Male', 90, 56, 25, 65);
INSERT INTO simple_diet.metric_body (user_id, age, arm, bmi, body_fat, calf, chest, forearm, height, hips,
                                     metabolism, neck, sex, stomach, thigh, waits, weight)
VALUES (3, 20, 50, 20, 0, 45, 45, 65, 26, 34, 3200, 12, 'Female', 90, 56, 25, 65);
