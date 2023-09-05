class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11){
            for(int i : num_list){
                answer += i; // 모든 원소의 합
            }
        }else{
            answer++;
            for(int i : num_list){
                answer *= i; // 모든 원소의 곱
            }
        }
        return answer;
    }
}