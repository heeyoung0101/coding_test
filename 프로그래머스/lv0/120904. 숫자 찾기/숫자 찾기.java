class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        if(str.indexOf(Integer.toString(k)) < 0){
            return -1;
        }else{
            return str.indexOf(Integer.toString(k)) + 1; // 숫자 k가 있는 자리수
        }
    }
}