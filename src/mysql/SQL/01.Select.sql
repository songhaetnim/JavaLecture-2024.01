###################################################
#
#데이터 조작 언어(DML: Data Manipulation Language)
###################################################
SHOW DATABASES;          // 대소문자 구분없음
USE world;
SHOW TABLES;
DESC city;


/*
 * 1. Select
 */
 /*
 SELECT 필드명  
    FROM 테이블명
    JOIN 테이블명
    ON 조인 조건
    WHERE 조회 조건
    GROUP BY 필드명
    HAVING 그룹 조건
    ORDER BY 필드명 순서
    LIMIT 숫자 OFFSET 숫자;
*/


SELECT * FROM city;
SELECT `name`,population FROM city LIMIT 10;     # 필드명을 보존하고 싶을 때 `back quote` 사용

/*
 * 1.1 조회 조건: WHERE
 */

 SELECT * FROM city WHERE countrycode= 'kor';
 SELECT * FROM city WHERE population >= 9000000;
 SELECT * FROM city WHERE  counttrycode= 'kor' and population >= 1000000;

 SELECT DISTINCT  district FROM WHERE  WHERE countrycode= 'kor';   # 고유한 값 -DISTINCT

# 수도권 도시(서울, 인천, 경기)
SELECT * FROM city
    WHERE district='Seoul' or district='Inchon' or district= 'Kyonggi';
SELECT * FROM city WHERE district IN('Seoul', 'Inchon', 'Kyongg');


 # 경기도에서 인구수가 홀수인 도시
 SELECT * FROM city WHERE district='Kyonggi' AND  population % 2 =1;

# 국내에서 인구수가 50만 ~ 100만 도시0
SELECT * FROM city WHERE countrycode= 'kor' AND
    population >= 500000 AND population <= 1000000;
    SELECT * FROM city WHERE countrycode= 'kor' AND latipopuon between 500000 AND 1000000;


# 충청남북도의 도시
SELECT * FROM city
WHERE district='Chungchongbuk' or district='Chungchongnam';
SELECT * FROM city WHERE district LIKE 'Tae%';   #% - 임의의 문자, 이때는 LIKE 사용

/*
 * 1.2 순서(Order) - ASC(Ascending: 오름차순, default), DESC(Descending: 내림차순)
 */
 # 인구수가 900만 이상인 도시를 인구수의 내림차순으로 조회
 SELECT * FROM city  WHERE population  >= 9000000
    ORDER BY  population DESC;




# 국내에서 인구수가 50만 ~ 100만 도시를 지역 오름차순, 인구수 내림차순으로 조회

SELECT * FROM city WHERE countrycode= 'kor' AND populationbetween 500000 AND 1000000
    ORDER  BY district, population DESC;    #ASC 생략가능

    /*
     *1.3 갯수
     */
    # 전세계 인구수 Top 10 도시

    SELECT * FROM city  ORDER  BY  population  DESC LIMIT 10;


# 국내 인구수 Top 5 도시
 SELECT * FROM city WHERE countrycode='Kor' ORDER  BY population DESC LIMIT 5;

# 국내 인구수 Top 11~20 도시
 SELECT * FROM city WHERE countrycode='Kor' 
    ORDER  BY population DESC 
    LIMIT 10 OFFSET 10;           # 앞에서 10개를 건너뛰고, 10개를 보여줌 

 SELECT * FROM city WHERE countrycode='USA' 
    ORDER  BY population DESC 
    LIMIT 10;

    /*
     * 1.4 gkatn
     */
    # 현재 날짜와 시각
     SELECT now();   # 2024-02-01 13:45:02

    # 국내 도시의 갯수 - 레코드의 갯수
    SELECT count(*) FROM city WHERE countrycode='kor' 

    # 최대, 최소 - 국내 도시중 인구수 최대, 최소 도시
    SELECT MAX(population), MIN(population) FROM city WHERE countrycode='kor';

    # 국내 도시의 인구 평균
    SELECT ROUND(AVG(population)) FROM city WHERE countrycode='kor'; 

    #Aliasing
SELECT ROUND(AVG(population)) ASavgPop FROM city WHERE countrycode='kor';    # AS 생략가능 
/*  SELECT ROUND(AVG(population)) ASavgPop FROM city WHERE countrycode='kor';  AS는 써도되고 안써도됨*/

 SELECT count (*) numCity FROM city WHERE countrycode='kor';

 /*
  * 1.5 그룹핑
  */
  # 국내 광역시도별 인구수의 평균 내림차순으로 조회
  SELECT district, ROUND(AVG(population)) avgPop FROM city 
    WHERE countrycode='KOR'
    GROUP BY district
    ORDER BY  avgPop DESC;

 # 국내 도별(도시의 갯수가 2개 이상) 인구수의 평균 내림차순으로 조회
 SELECT district, ROUND(AVG(population)) avgPop FROM city 
    WHERE countrycode='KOR'
    GROUP BY district
    HAVING count(*) >= 2            # 그룹핑 조건 - 도시의 갯수가 2개 이상
    ORDER BY  avgPop DESC;

# 도시의 갯수가 많은 나라  Top 10
SELECT countrycode, count(*) numCity FROM city
    GROUP BY countrycode
    ORDER BY numCity DESC
    LIMIT 10;

# 경기도의 도시 이름
SELECT `name` FROM city WHERE district='KYonggi';
SELECT GROUP_CONCAT (`name`) cities FROM city WHERE district='Chungchongnam';

# 국내 광역시도 이름 
SELECT DISTINCT district FROM city WHERE countrycode='KOR';
SELECT GROUP_CONCAT(district) districts FROM city WHERE countrycode='KOR';        


/*
 * 1.6 그룹핑 조건
 */
 # 국내 도별(도시의 갯수가 2개 이상) 인구수의 평균 내림차순으로 조회
 SELECT district, ROUND(AVG(population)) avgPop FROM city 
    WHERE countrycode='KOR'
    GROUP BY district
    HAVING count(*) >= 2            # 그룹핑 조건 - 도시의 갯수가 2개 이상
    ORDER BY  avgPop DESC;

# 국내 도시의 갯수가 5개 이상인 도
SELECT district, count(*) numCity FROM city
WHERE countrycode='KOR'
GROUP BY district
HAVING numCity >= 5;

# 국내 도시의 갯수가 5개 이상인 도의 평균 도시 인구수를 인구 평균 내림차순으로 정렬
SELECT district, ROUND(AVG(population)) avgPop FROM city
    WHERE countrycode='KOR'
    GROUP BY district
    HAVING count(*) >= 5
    ORDER BY avgPop DESC;

# 도시 갯수가 100개 이상인 국가의 도시인구 평균을 내림차순으로 정렬
SELECT countrycode, count(*) numCity, ROUND(AVG(population)) avgPop FROM city
    GROUP BY countrycode
    HAVING count(*) >= 100
    ORDER BY avgPop DESC;



    /*
     * 1.7 Join 90% 쓴다 인나조인: 교집합  폴아웃트조인: 모든합 집합
     */
    # 인구수가 800만보다 큰 도시의 국가명, 도시명, 인구수
    SELECT country.Name, city.population FROM city
        JOIN country ON city.countrycode=country.Code
        WHERE city.population > 8000000;
    
    /* SELECT r.Name country, l.Name cityName, l.Population FROM city l
	JOIN country r                  # INNER 생략 가능
	ON l.CountryCode=r.Code
	WHERE l.Population >8000000;
    
    
    SELECT r.Name country, l.Name cityName, l.Population FROM city l
    INNER JOIN country r               # INNER 생략 가능
	ON l.CountryCode=r.Code
	WHERE l.Population >8000000; */

    # 양쪽 테이블에서 필드명이 고유한 필드는 테이블 이름을 생략할 수 있음(Continent)


    # 아시아 대륙에서 인구수가 많은 도시 Top 10
    SELECT Continent, r.Name country, l.Name cityName, l.population

    /*
     * 1.8 Sub Query
     */
    # 국내 도시만으로 새로운 테이블을 만드는 경우
    create table if not exists kcity LIKE city;
    INSERT INTO kcity
        Select * from city WHERE countrycode='KOR';
    




    