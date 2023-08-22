class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = Integer.toString(n); // int to String
        char[] arrN = strN.toCharArray(); // String to char Array
        for(char charN : arrN){
            answer += Character.getNumericValue(charN); // char to int(아스키코드 아님)
        }
        return answer; // 자리수를 모두 더한 값
    }
}