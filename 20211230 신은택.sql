-- 도서관 디비 구성해보기
CREATE TABLE library(
     book_name varchar(30) primary key,
     book_price int(7) not null,
     book_pub varchar(20) not null,
     book_writer varchar(10) not null,
     book_page int(5) not null
     );
     
INSERT INTO library VALUES ('real mysql 1', 30000,'위키북스',900);
INSERT INTO library VALUES ('real mysql 2', 32000,'위키북스',800);

select*from library;     
use ict_practice;
drop table library;