class Solution {
    public int solution(int[] num_list) {
        String odd = "";  // 홀수의 합(문자열 더하기)
        String even = ""; // 짝수의 합(문자열 더하기)
        int answer = 0;   // odd + even (숫자 더하기)
        
        for(int num : num_list){
            if(num % 2 == 0){
                even += num;
            }else{
                odd += num;
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd); // 다시 정수로 바꿔서 덧셈
        
        return answer;
    }
}