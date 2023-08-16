class Solution {
    public int solution(int n, int k) {
        int answer = 12000 * n + 2000 * k; // 양꼬치와 음료수 값을 모두 더하기
        answer -= n / 10 * 2000; // 서비스를 받을 수 있는 횟수에 음료수 값을 곱해서 총 금액에서 빼기
        return answer;
    }
}