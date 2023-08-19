import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2; // 삼각형의 조건 > 가장 큰 변의 길이가 나머지 두 변의 길이보다 작아야 함
    }
}