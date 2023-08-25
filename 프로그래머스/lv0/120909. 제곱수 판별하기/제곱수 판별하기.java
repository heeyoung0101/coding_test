class Solution {
    public int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2; // 제곱근이 정수인지 확인
    }
}
// 제곱: Math.pow()
// 제곱근: Math.sqrt() 