class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = new int[num2 - num1 + 1];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[num1 + i]; // 미리 정해놓은 배열의 크기만큼 반복문을 돌며 값 입력
        }
        
        return answer;
    }
}