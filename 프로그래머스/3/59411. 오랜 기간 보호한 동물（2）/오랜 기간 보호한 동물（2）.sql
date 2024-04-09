SELECT ao.ANIMAL_ID, ao.NAME
FROM ANIMAL_INS ai inner join ANIMAL_OUTS ao using(ANIMAL_ID)
order by datediff(ao.DATETIME,ai.DATETIME) desc
limit 2