SELECT CAR_ID
     , AVERAGE_DURATION
  FROM (
        SELECT CAR_ID
             , ROUND(AVG(END_DATE - START_DATE + 1), 1) AS "AVERAGE_DURATION" -- DATE 끼리 빼면 일수가 나옴, ROUND 반올림 함수
          FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
         GROUP BY CAR_ID
      )
 WHERE AVERAGE_DURATION >= 7      
 ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC
 /* 대여기간이니 + 1 해줘야 함..*/
 /* HAVING절에서 alias를 인식할 수 없어 서브쿼리로 */