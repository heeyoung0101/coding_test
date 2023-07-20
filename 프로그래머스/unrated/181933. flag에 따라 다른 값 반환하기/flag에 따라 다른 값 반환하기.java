class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = flag ? a + b : a - b; // flag가 true면 덧셈, 아니면 뺄셈
        return answer;
    }
}