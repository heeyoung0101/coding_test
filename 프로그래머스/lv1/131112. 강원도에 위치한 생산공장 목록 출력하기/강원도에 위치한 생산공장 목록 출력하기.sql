  SELECT FACTORY_ID
       , FACTORY_NAME
       , ADDRESS
    FROM FOOD_FACTORY
   WHERE ADDRESS LIKE '강원도%' -- 강원도 문자열은 항상 컬럼의 맨 앞에서 시작함
ORDER BY FACTORY_ID