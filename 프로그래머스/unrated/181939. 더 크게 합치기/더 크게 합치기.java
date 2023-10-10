class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b)); // 문자열 a + b
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a)); // 문자열 b + a
        return ab >= ba ? ab : ba; // 더 큰 수
    }
}