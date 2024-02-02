###################################################
#
#데이터 조작 언어(DML: Data Manipulation Language)
###################################################

/*
 * 1.테이블 생성
 *   ERMaster
 */
 # 주소록 테이블 생성
CREATE TABLE addrsBook
(
	aid int NOT NULL AUTO_INCREMENT,
	name varbinary(16) NOT NULL,
	tal varchar(16),
	emall varchar(32),
	blrthDay date,
	PRIMARY KEY (aid)
);

# 사용자 테이블  생성
CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varbinary(16) NOT NULL,
	email varchar(32),
	regDate date DEFAULT current_date,
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);



