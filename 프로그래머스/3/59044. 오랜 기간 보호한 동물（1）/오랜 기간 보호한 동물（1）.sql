-- 코드를 입력하세요
SELECT ai.NAME,ai.DATETIME
from ANIMAL_INS ai left join ANIMAL_OUTS ao on ai.ANIMAL_ID=ao.ANIMAL_ID
where ao.ANIMAL_ID is null
order by date_format(ai.DATETIME, '%y-%m-%d')
limit 3