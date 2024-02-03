# 1. 2009년도에 데뷔한 걸그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)

SELECT l.name AS 이름, l.debut, r.title 
FROM girl_group l
JOIN song r 
ON r.sid=l.hit_song_id 
WHERE YEAR(l.debut)='2009';

# 2. 데뷔일자가 빠른 5개 그룹의 힛트송은?
#(걸그룹 이름, 데뷔일자, 힛트송 제목)

SELECT l.name,l.debut, r.title 
FROM girl_group l
JOIN song r
ON r.sid=l.hit_song_id
ORDER BY debut 
LIMIT 5;

# 3.대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?

SELECT Continent, COUNT(*), SUM(GNP), ROUND(AVG(GNP))
FROM country
GROUP BY Continent;

# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
#   (대륙명, 국가명, 도시명, 인구수)

SELECT l.Continent 대륙명,l.Name 국가명, r.Name 도시명,r.Population 인구수
FROM country l
JOIN city r
ON l.Code=r.CountryCode
WHERE l.Continent='asia'
ORDER BY r.Population DESC
LIMIT 10;

# 5.  전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
#                   (국가명, GNP, 언어명)

SELECT l.name, l.GNP, min(r.Language)
FROM country l
JOIN countrylanguage r
ON l.Code = r.CountryCode
WHERE r.IsOfficial='T'
GROUP BY l.Code
ORDER BY l.gnp DESC
LIMIT 10;


/*
ORDER BY 필드명은  1 에서 2로 갈때 오름차순
ORDER BY 필드명 DESC은  2 에서 1로 갈때 내림차순 ** 내림차순일떈 DESC 꼭 씀 꼬리표처럼 꼭 씀 
*/
