SELECT COUNT(1) AS USERS -- WHERE절을 만족하는 회원의 수
  FROM USER_INFO
 WHERE AGE IS NULL -- 나이 정보가 없는 회원