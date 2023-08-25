class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(char c : charArr){
            if(c >= 65 && c <= 90){ // 대문자일 때
                answer += String.valueOf(c).toLowerCase(); // 소문자로 변환  
            }else if(c >= 97 && c <= 122){ // 소문자일 때
                answer += String.valueOf(c).toUpperCase(); // 대문자로 변환                
            }
        }
        return answer;
    }
}