class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                answer += my_string.charAt(i); // 문자열의 각 문자를 n번 반복한 문자열  
            }
        }
        return answer;
    }
}