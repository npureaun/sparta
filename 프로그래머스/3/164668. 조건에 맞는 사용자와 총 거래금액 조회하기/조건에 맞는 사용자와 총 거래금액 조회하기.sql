-- 코드를 입력하세요
SELECT uu.USER_ID, uu.NICKNAME, sum(ub.PRICE)TOTAL_SALES
from USED_GOODS_BOARD ub join USED_GOODS_USER uu on ub.WRITER_ID=uu.USER_ID
where ub.STATUS='DONE' 
group by ub.WRITER_ID
having sum(ub.PRICE)>=700000
order by sum(ub.PRICE)