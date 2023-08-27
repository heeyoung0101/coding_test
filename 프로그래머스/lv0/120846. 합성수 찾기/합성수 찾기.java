class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= n; j++){
                if(i % j == 0){ // j가 i의 약수일 때
                    count++;
                }
                if(count >= 3){ // 약수가 3개일 때 결과값을 하나 증가시킨 후 반복문 나가기
                    answer++;
                    break;
                }         
            }
        }
        return answer;
    }
}