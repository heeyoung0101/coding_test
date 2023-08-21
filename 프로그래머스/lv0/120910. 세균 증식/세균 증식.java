class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int i = 1; i <= t; i++){
            answer *= 2; // 1시간 지날 때 마다 2배로 증식
        }
        return answer;
    }
}