-- 코드를 입력하세요
SELECT substr(DATETIME, 12, 2)'HOUR', count(*)
from ANIMAL_OUTS
where HOUR(DATETIME) between '09:00' and '19:59'
group by substr(DATETIME, 12, 2)
order by substr(DATETIME, 12, 2)