import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] > height){ // 머쓱이보다 키 큰 사람일 때 증가
                answer++;
            }
        }
        return answer;
    }
}