-- 코드를 입력하세요
SELECT ao.ANIMAL_ID, ao.NAME
from ANIMAL_INS ai right join ANIMAL_OUTS ao using(ANIMAL_ID)
where ai.ANIMAL_ID is null