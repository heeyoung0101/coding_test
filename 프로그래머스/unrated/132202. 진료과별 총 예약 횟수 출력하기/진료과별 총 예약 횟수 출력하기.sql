SELECT MCDP_CD AS "진료과코드" -- ALIAS에 띄어쓰기 안 됨
     , COUNT(PT_NO) AS "5월예약건수" -- ALIAS에 숫자가 들어가면 ""로 묶어야 함
  FROM APPOINTMENT
 WHERE TO_CHAR(APNT_YMD, 'YYYYMM') = '202205'
 GROUP BY MCDP_CD
 ORDER BY "5월예약건수", "진료과코드"