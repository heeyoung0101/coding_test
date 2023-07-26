class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        int i = 0;
        while(n >= sum){ // sum이 n보다 커지는 순간 return
            sum += numbers[i];
            i++;
        }
        return sum;
    }
}