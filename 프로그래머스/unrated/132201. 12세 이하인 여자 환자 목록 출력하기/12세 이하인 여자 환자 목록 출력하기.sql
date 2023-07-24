SELECT PT_NAME
     , PT_NO
     , GEND_CD
     , AGE
     , NVL(TLNO, 'NONE') AS "TLNO" -- 전화번호가 없으면 NONE으로 표시
  FROM PATIENT
 WHERE AGE <= 12
   AND GEND_CD = 'W'
 ORDER BY AGE DESC, PT_NAME
 