SELECT l.Continent 대륙명,l.Name 국가명, r.Name 도시명,r.Population 인구수
FROM country l
JOIN city r
ON l.Code=r.CountryCode
WHERE l.Continent='asia'
ORDER BY r.Population DESC
LIMIT 10;

