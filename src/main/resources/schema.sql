DROP TABLE IF EXISTS car;

  CREATE TABLE car (
    serial_id INT  PRIMARY KEY,
    brand_name VARCHAR(250) NOT NULL,
    model_name VARCHAR(250) NOT NULL,
    life_time INT NOT NULL
  );