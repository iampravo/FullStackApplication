DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  serialId INT  PRIMARY KEY,
  brandName VARCHAR(250) NOT NULL,
  modelName VARCHAR(250) NOT NULL,
  lifeTime INT NOT NULL,
);