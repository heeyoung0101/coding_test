  SELECT DR_NAME
       , DR_ID
       , MCDP_CD
       , TO_CHAR(HIRE_YMD, 'YYYY-MM-DD') /* mysql로 실행하여 에러 뜸, 날짜 포맷 함수 */
    FROM DOCTOR
   WHERE MCDP_CD = 'CS' -- 흉부외과 혹은 일반외과
      OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME