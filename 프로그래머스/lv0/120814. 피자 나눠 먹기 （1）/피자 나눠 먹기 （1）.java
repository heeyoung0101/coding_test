class Solution {
    public int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1; // 사람 수를 7로 나눈 나머지가 0이면 몫인 피자의 수가 딱 떨어지게 나오고, 나머지가 1~6이면 몫의 값보다 피자가 한 판 더 필요함
    }
}
