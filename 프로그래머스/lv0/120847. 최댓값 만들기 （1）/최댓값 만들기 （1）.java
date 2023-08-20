import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순 정렬
        return numbers[numbers.length - 1] * numbers[numbers.length - 2]; // 가장 큰 원소 * 두 번째로 큰 원소
    }
}