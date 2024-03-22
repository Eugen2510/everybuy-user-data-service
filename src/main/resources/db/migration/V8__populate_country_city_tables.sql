-- Вставка случайных данных в таблицу country
INSERT INTO country (country_name)
VALUES ('Україна'),
       ('Німеччина'),
       ('Сполучені Штати');

-- Вставка случайных данных в таблицу city
INSERT INTO city (city_name, country_id)
VALUES ('Київ', (SELECT id FROM country WHERE country_name = 'Україна' ORDER BY RANDOM() LIMIT 1)),
       ('Берлін', (SELECT id FROM country WHERE country_name = 'Німеччина' ORDER BY RANDOM() LIMIT 1)),
       ('Нью-Йорк', (SELECT id FROM country WHERE country_name = 'Сполучені Штати' ORDER BY RANDOM() LIMIT 1));
