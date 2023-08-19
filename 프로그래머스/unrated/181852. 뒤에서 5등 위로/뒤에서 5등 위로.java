import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list); // 원본 배열을 수정, 오름차순으로 정렬
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[i + 5]; // 가장 작은 5개 수를 제외한 수를 오름차순으로 return
        }
        return answer;
    }
}