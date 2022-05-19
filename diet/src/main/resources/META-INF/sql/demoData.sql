create DATABASE simple_diet
    char set utf8
    collate utf8_general_ci;

use simple_diet;

INSERT INTO simple_diet.users (id, name, surname, email, phone_number, street, address, postal_code, sex, age, height,
                               weight)
VALUES (1, 'Jan', 'Kowalski', 'abc@abc.pl', '123456789', 'Krupnicza 14', 'Kraków', '33-300', 'Male', 18, 180, 100);
INSERT INTO simple_diet.users (id, name, surname, email, phone_number, street, address, postal_code, sex, age, height,
                               weight)
VALUES (2, 'Adam', 'Nowak', 'nowa@nowa.pl', '987654321', 'Słomiana 10', 'Warszawa', '12-345', 'Male', 30, 175, 85);
INSERT INTO simple_diet.users (id, name, surname, email, phone_number, street, address, postal_code, sex, age, height,
                               weight)
VALUES (3, 'Joanna', 'Brzoza', 'brzoza@onet.pl', '000000000', 'Rolnicza 1', 'Gdańsk', '10-000', 'Female', 20, 160, 55);
