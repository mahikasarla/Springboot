CREATE TABLE FILE_INFO
(ID INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
FILE_NAME VARCHAR(100),
SIZE int(10),
CONTENT_TYPE VARCHAR(20),
IMAGE BLOB(7483647),
CREATED_TIME TIMESTAMP
);