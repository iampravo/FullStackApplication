DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS heatmap;
DROP TABLE IF EXISTS histogram;



  CREATE TABLE car (
    serial_id INT  PRIMARY KEY,
    brand_name VARCHAR(250) NOT NULL,
    model_name VARCHAR(250) NOT NULL,
    life_time INT NOT NULL
  );

    CREATE TABLE heatmap (
      id INT  PRIMARY KEY,
      group_id VARCHAR (250) NOT NULL,
      variable VARCHAR(250) NOT NULL,
      value INT NOT NULL
    );

        CREATE TABLE histogram (
          id INT  PRIMARY KEY,
          name VARCHAR (250) NOT NULL,
          value INT NOT NULL
        );