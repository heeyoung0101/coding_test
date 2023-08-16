class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++){ // 배열의 길이는 length
            answer += (double) numbers[i];
        }
        answer = answer / numbers.length;
        return answer;
    }
}