create database if not exists bbs;
use bbs;



SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS repiy;
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE board
(
	bid int NOT NULL AUTO_INCREMENT,
	title varchar(256) NOT NULL,
	content varchar(4000),
	modTime datetime DEFAULT (CURRENT_DATE),
	uid varchar(12) NOT NULL,
	isDeleted int DEFAULT 0,
	viewCount int DEFAULT 0,
	replyCount int DEFAULT 0,
	PRIMARY KEY (bid)
);


CREATE TABLE repiy
(
	rid int NOT NULL AUTO_INCREMENT,
	comment varchar(256) NOT NULL,
	regTime datetime DEFAULT (CURRENT_DATE),
	uid varchar(12) NOT NULL,
	bid int NOT NULL,
	PRIMARY KEY (rid)
);


CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(16),
	email varchar(32),
	rgeDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE repiy
	ADD FOREIGN KEY (bid)
	REFERENCES board (bid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE repiy
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



