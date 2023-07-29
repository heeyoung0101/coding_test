class Solution {
    public int[] solution(int start, int end) {
        int length = end - start + 1;   // 배열의 길이
        int[] answer = new int[length]; // 배열 초기화
        
        for(int i = 0; i < length; i++){
            answer[i] = start + i;      // start부터 end까지 값 추가
        }
        return answer;
    }
}