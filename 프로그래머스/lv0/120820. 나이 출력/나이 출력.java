class Solution {
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1; // 현재 연도에서 나이를 뺀 뒤 1을 더해야 태어난 연도(한국식)
        
        return answer;
    }
}