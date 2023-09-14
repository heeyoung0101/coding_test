class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            answer[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase(); // 짝수번째는 소문자, 홀수번째는 대문자
        }
        return answer;
    }
}