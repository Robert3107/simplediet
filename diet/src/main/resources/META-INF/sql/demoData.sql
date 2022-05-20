create DATABASE simple_diet
    char set utf8
    collate utf8_general_ci;

use simple_diet;

INSERT INTO simple_diet.users (id, name, surname, email, phone_number, street, address, postal_code)
VALUES (1, 'Jan', 'Kowalski', 'abc@abc.pl', '123456789', 'Krupnicza 14', 'Kraków', '33-300');
INSERT INTO simple_diet.users (id, name, surname, email, phone_number, street, address, postal_code)
VALUES (2, 'Adam', 'Nowak', 'nowa@nowa.pl', '987654321', 'Słomiana 10', 'Warszawa', '12-345');
INSERT INTO simple_diet.users (id, name, surname, email, phone_number, street, address, postal_code)
VALUES (3, 'Joanna', 'Brzoza', 'brzoza@onet.pl', '000000000', 'Rolnicza 1', 'Gdańsk', '10-000');
