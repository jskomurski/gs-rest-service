DROP TABLE Data IF EXISTS;

CREATE TABLE Data (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1) NOT NULL,
  resourcetype VARCHAR(100) NOT NULL,
  name VARCHAR(100) NOT NULL,
  age BIGINT,
  locale VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);