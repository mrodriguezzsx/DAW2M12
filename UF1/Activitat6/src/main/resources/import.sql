INSERT INTO COURSE (TITLE) VALUES ('COURSE 1'); 
INSERT INTO COURSE (TITLE) VALUES ('COURSE 2');

INSERT INTO COURSE_MATERIAL (URL,COURSE_ID) VALUES ('http://localhost:8080/h2-console',1);
INSERT INTO COURSE_MATERIAL (URL,COURSE_ID) VALUES ('https://www.google.es/',2); 

INSERT INTO STUDENT (LAST_NAME, FIRST_NAME, BIRTH_DATE, WANTS_NEWSLETTER) VALUES ('Rodriguez','Matias','2002-11-06','false'); 
INSERT INTO STUDENT (LAST_NAME, FIRST_NAME, BIRTH_DATE, WANTS_NEWSLETTER) VALUES ('Jimenez','Oriol','2002-04-21','true'); 