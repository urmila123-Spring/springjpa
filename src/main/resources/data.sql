CREATE TABLE IF NOT EXISTS USER (
    USER_ID INT AUTO_INCREMENT PRIMARY KEY,
    USER_NAME VARCHAR(255) NOT NULL,
    USER_ROLE VARCHAR(255) NOT NULL,
  );
  
  
  
  INSERT INTO USER(USER_NAME, USER_ROLE) VALUES ('JOHN','ADMIN');
   INSERT INTO USER(USER_NAME, USER_ROLE) VALUES ('SMILEY','USER');
  