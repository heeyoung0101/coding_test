class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / (double)num2 * 1000; // int끼리 나누면 소수점 아래 무시, double로 만든 뒤 나누어야함
        return (int)answer;
    }
}