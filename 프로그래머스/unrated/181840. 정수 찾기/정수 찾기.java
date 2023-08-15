class Solution {
    public int solution(int[] num_list, int n) {
        for(int num : num_list){ // 배열 값의 길이만큼 반복문 실행, num은 각 원소의 값
            if(num == n){
                return 1;
            }
        }
        return 0;
    }
}