class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){ // 배열에 있는 숫자 n의 개수 구하기
                answer++;
            }
        }
        return answer;
    }
}