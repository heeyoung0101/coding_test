SELECT NAME
     , DATETIME
  FROM (
        SELECT A.NAME
             , A.DATETIME
          FROM ANIMAL_INS A  
          LEFT JOIN ANIMAL_OUTS B
            ON A.ANIMAL_ID = B.ANIMAL_ID
         WHERE B.ANIMAL_ID IS NULL -- 입양테이블에 ID가 없는 동물
         ORDER BY A.DATETIME
        )
  WHERE ROWNUM <= 3 -- 정렬 후 상위 3개까지 출력하기 위해 서브쿼리 사용