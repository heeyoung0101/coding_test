class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        
        for(int i : num_list){
            sum += i;
            multiply *= i;
        }
        
        return multiply < Math.pow(sum, 2) ? 1 : 0;
    }
}