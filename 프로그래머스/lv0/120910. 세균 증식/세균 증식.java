class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int i = 1; i <= t; i++){
            answer *= 2; // 1시간 지날 때 마다 2배로 증식
        }
        return answer;
    }

    /** 다른 사람 풀이 */
    public int solution2(int n, int t){
        int answer = 0;
        answer = n << t; // 이진수 n을 t만큼 쉬프트(2배)
        return answer;
    }
}