SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS addrsBook;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE addrsBook
(
	aid int NOT NULL AUTO_INCREMENT,
	name varbinary(16) NOT NULL,
	tal varchar(16),
	emall varchar(32),
	blrthDay date,
	uid varchar(12) NOT NULL,
	PRIMARY KEY (aid)
);


CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varbinary(16) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (current_date),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE addrsBook
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



