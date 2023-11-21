import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // 오름차순 정렬
        int[] answer = new int[5];
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[i]; // 5개까지
        }
        return answer;
    }
}