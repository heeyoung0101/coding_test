class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = k % 2 == 0 ? arr[i] + k : arr[i] * k; // 짝수면 더하고 홀수면 곱하기
        }
        return answer;
    }
}