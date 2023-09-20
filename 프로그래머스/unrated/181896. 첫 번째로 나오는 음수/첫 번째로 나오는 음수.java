class Solution {
    public int solution(int[] num_list) {
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0) return i; // 처음으로 나오는 음수의 인덱스
        }
        return -1;
    }
}