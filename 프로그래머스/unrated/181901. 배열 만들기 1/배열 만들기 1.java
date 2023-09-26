class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int index = 0; // 인덱스
        for(int i = k; i <= n; i += k){
            answer[index++] = i; // n이하 정수 중 k의 배수
        }
        return answer;
    }
}