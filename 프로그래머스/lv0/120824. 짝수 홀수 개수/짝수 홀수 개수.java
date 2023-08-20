class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){ // 원소가 짝수일 때
                answer[0]++; // 짝수 갯수 + 1
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}