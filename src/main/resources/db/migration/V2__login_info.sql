CREATE TABLE PUBLIC.LOGIN_INFO
(
ID INTEGER NOT NULL,
FIRST_NAME VARCHAR2(20),
LAST_NAME VARCHAR2(20),
MAIL_ID VARCHAR2(20),
PASSWORD VARCHAR2(20),
CREATED_TIME TIMESTAMP,
PRIMARY KEY (ID)
);