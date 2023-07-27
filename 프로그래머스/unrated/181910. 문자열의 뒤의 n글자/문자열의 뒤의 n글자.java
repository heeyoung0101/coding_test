class Solution {
    public String solution(String my_string, int n) {
        int startIndex = (my_string.length() - n);
        return my_string.substring(startIndex); // 문자열의 뒤의 n글자로 이루어진 문자열
    }
}