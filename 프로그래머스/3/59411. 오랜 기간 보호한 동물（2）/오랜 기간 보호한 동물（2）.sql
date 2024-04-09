SELECT ao.ANIMAL_ID, ao.NAME
FROM ANIMAL_INS ai inner join ANIMAL_OUTS ao using(ANIMAL_ID)
order by ao.DATETIME-ai.DATETIME desc
limit 2