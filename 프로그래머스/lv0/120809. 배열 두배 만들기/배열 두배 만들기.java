class Solution {
    public int[] solution(int[] numbers) {
        
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[i] * 2; // 기존 배열의 각 원소의 두 배
        }
        
        return answer;
    }
}