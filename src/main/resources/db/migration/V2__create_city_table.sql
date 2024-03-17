CREATE TABLE IF NOT EXISTS city(
	id SERIAL PRIMARY KEY,
	city_name VARCHAR(100),
	country_id SERIAL,
	CONSTRAINT fk_country_city
	FOREIGN KEY (country_id) REFERENCES country(id)
)