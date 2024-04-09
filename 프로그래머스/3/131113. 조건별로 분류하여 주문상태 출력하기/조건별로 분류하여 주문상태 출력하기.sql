-- 코드를 입력하세요
SELECT ORDER_ID,PRODUCT_ID,date_format(OUT_DATE, "%Y-%m-%d")'OUT_DATE',
case
when date_format(OUT_DATE, "%m-%d")<="05-01" then "출고완료"
when date_format(OUT_DATE, "%m-%d")>"05-01" then "출고대기"
else "출고미정"
end "출고여부"
from FOOD_ORDER
order by ORDER_ID