class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a % 2 == 0 && b % 2 == 0){
            answer += Math.abs(a - b); // 절대값
        }else if(a % 2 != 0 && b % 2 != 0){
            answer += Math.pow(a, 2) + Math.pow(b, 2); // 제곱
        }else{
            answer += 2 * (a + b);
        }
        return answer;
    }
}