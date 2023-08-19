class Solution {
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1; // 조각 수가 7이 아닌 slice로 주어짐(피자1 응용)
    }
}