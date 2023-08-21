class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){
                if(i * j == n){ // 순서쌍의 첫 번째 원소가 1부터 n까지일 때, 두 번째 원소 n부터 1까지
                    if(i < j){
                        answer++;    
                        break; // i가 고정되어 있을 때 i * j가 n인 j값은 하나이므로 반복문 나가기
                    }else if(i == j){
                        return answer * 2 + 1; // 순서쌍의 두 원소가 같을 때 지금까지 순서쌍 개수의 2배 + 1
                    }else{
                        return answer * 2; // 순서쌍의 두 번째 원소가 첫 번째 원소보다 클 때 지금까지 순서쌍 개수의 2배
                    }
                }
            }
        }
        return answer;
    }
}