class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        
        for(int i = 1; i <= num_list.length; i++){
            if(i % 2 == 0){
                evenSum += num_list[i - 1]; // 짝수 번째 원소들의 합
            }else{
                oddSum += num_list[i - 1]; // 홀수 번째 원소들의 합
            }
        }
        return evenSum >= oddSum ? evenSum : oddSum; // 더 큰 것
    }
}