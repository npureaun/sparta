-- 코드를 입력하세요
SELECT floor(PRICE/10000)*10000'PRICE_GROUP',count(PRODUCT_ID) 'PRODUCTS'
from PRODUCT
group by PRICE_GROUP
order by PRICE_GROUP