class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code - 1; i < cipher.length(); i += code){ // code의 배수 번째 글자만 진짜 암호
            answer += cipher.charAt(i);
        }
        return answer;
    }
}