class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(!letter.equals(String.valueOf(my_string.charAt(i)))){ // String.valueOf(char) - char타입을 String 타입으로 변환
                answer += my_string.charAt(i);    
            }
        }
        return answer;
    }
}