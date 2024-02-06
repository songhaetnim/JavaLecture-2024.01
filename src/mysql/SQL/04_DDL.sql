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

/*
 * 2. 테이블 조회
 */
 # 데이터베이스내의 테이블 목록
 SHOW TABLES;



#테이블 구조
DESC users;     #desc users;

/*
 * 3. 테이블 삭제
 */
# largeCity view 삭제
drop view largeCity;

# dateTable 삭제
DROP TABLE dateTable;

# kcity 테이블의 모든 데이터 삭제
truncate Kcity;

/*
 * 4. 테이블 이름 변경
 *
 */

 RENAME TABLE Kcity TO KorCity;
--  SHOW TABLES;

/*
 * 5. 테이블 구조 변경
 */
 # users 테이블에서 email 뒤에 tel 추가
ALTER TABLE users
    ADD tel VARCHAR(16) NOT NULL AFTER email;

#users 테이블에서 tel 필드의 not null 제거
 ALTER TABLE users
    CHANGE tel tel VARCHAR(16);