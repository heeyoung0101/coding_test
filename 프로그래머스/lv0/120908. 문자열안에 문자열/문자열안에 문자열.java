class Solution {
    public int solution(String str1, String str2) {
        if(str1.indexOf(str2) >= 0){ // str2의 인덱스(없다면 -1)
            return 1;
        }
        return 2;
    }
}