class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.lastIndexOf(is_suffix) > -1){ // lastIndex가 존재할 때 
            return my_string.lastIndexOf(is_suffix) + is_suffix.length() == my_string.length() ? 1 : 0; // 접미사의 길이를 더하면 문자열의 길이일 때
        }
        return 0;
    }
}