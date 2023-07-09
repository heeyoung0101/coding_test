class Solution {
    public int solution(int num1, int num2) {
        
        int answer = num1 % num2;
        
        return answer;
            
    }
}

/** 다른 사람 풀이 - 나머지를 잘 생각해보자 */
class Solution2 {
    public int solution(int num1, int num2) {
        while (num1 >= num2) { // while문을 돌며 num2의 배수만큼 계속 뺄셈을 하다가 남은 값이 나머지, % 연산자를 쓰지 않고 결과를 냄
            num1 = num1 - num2;
        }
        int answer = num1;
        return answer;
    }
}