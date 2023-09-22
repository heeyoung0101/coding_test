class Solution {
    public int solution(String myString, String pat) {
        // 대소문자 구분없이 부분문자열
        return myString.toUpperCase().indexOf(pat.toUpperCase()) > -1 ? 1 : 0; 
    }
}