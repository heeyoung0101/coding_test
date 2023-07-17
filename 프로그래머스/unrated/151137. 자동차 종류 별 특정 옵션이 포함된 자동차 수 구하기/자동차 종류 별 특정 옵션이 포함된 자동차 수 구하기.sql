SELECT CAR_TYPE
     , COUNT(CAR_ID) AS CARS
  FROM CAR_RENTAL_COMPANY_CAR
 WHERE OPTIONS LIKE '%통풍시트%' -- 리스트 데이터 중 통풍시트, 열선시트, 가죽시트 중 하나 이상 포함
    OR OPTIONS LIKE '%열선시트%'
    OR OPTIONS LIKE '%가죽시트%' 
 GROUP BY CAR_TYPE -- 자동차 종류 별로 몇 대인지 출력
 ORDER BY CAR_TYPE