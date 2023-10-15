class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){ // 50보다 크거나 같고 짝수
                answer[i] = arr[i] / 2;
            }else if(arr[i] < 50 && arr[i] % 2 == 1){ // 50보다 짝고 홀수
                answer[i] = arr[i] * 2;
            }else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}