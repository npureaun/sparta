-- 코드를 입력하세요
SELECT b.BOOK_ID,a.AUTHOR_NAME,
date_format(b.PUBLISHED_DATE, '%Y-%m-%d')'PUBLISHED_DATE'
from  AUTHOR a left join BOOK b using(AUTHOR_ID)
where b.CATEGORY = '경제'
order by b.PUBLISHED_DATE