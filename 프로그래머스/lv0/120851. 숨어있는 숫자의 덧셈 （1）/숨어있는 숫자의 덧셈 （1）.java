class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] charArr = my_string.toCharArray();
        for(char c : charArr){
            if(c >= 48 && c <= 57){
                answer += Character.getNumericValue(c);
            }
        }
        return answer;
    }
}

/* 
아스키코드

1. 숫자 0 ~ 9
> 48 ~ 57
 
2. 영문 a ~ z
> 대문자 65 ~ 90
> 소문자 97 ~ 122 
*/