-- 코드를 입력하세요
SELECT USER_ID, PRODUCT_ID
FROM ONLINE_SALE
group by PRODUCT_ID,USER_ID
having count(*)>1
order by USER_ID, PRODUCT_ID desc