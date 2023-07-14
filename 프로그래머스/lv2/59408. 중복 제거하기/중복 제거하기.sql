SELECT COUNT(DISTINCT NAME) AS COUNT -- Null이 아니고 중복되지 않은 이름 수 
  FROM ANIMAL_INS 
  /* DISTINCT 를 괄호 안의 컬럼명 앞에 사용 */