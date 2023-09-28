SELECT BOARD_ID
     , WRITER_ID
     , TITLE
     , PRICE
     , CASE STATUS WHEN 'SALE' THEN '판매중' -- STATUS별 한글명
                   WHEN 'RESERVED' THEN '예약중'
                   WHEN 'DONE' THEN '거래완료'
                   ELSE '' END
  FROM USED_GOODS_BOARD
 WHERE CREATED_DATE = TO_DATE('20221005', 'YYYYMMDD')
 ORDER BY BOARD_ID DESC