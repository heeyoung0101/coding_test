class Solution {
    public int solution(int hp) {
        int ant1 = hp / 5; // 장군개미 수
        int ant2 = hp % 5 / 3; // 병정개미 수
        int ant3 = hp % 5 % 3; // 일개미 수
        return ant1 + ant2 + ant3;
    }
}