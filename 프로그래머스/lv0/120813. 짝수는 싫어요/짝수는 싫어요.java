class Solution {
    public int[] solution(int n) {
        
        int length = 0;
        
        if(n % 2 == 0){
            length += n / 2;
        }else{
            length += n / 2 + 1;
        }
        
        int[] answer = new int[length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = i * 2 + 1; // n 이하의 홀수가 담긴 배열
        }
        
        return answer;
    }
}