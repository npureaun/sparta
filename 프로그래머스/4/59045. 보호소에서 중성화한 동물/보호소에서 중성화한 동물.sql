SELECT ao.ANIMAL_ID, ao.ANIMAL_TYPE, ao.NAME
from ANIMAL_INS ai inner join ANIMAL_OUTS ao using(ANIMAL_ID)
where ai.SEX_UPON_INTAKE like 'Intact%' and 
ao.SEX_UPON_OUTCOME not like 'Intact%'