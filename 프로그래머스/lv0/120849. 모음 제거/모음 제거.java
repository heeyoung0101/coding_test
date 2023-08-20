class Solution {
    public String solution(String my_string) {
        String answer = my_string.replace("a", "") // 여러개 문자 모두 제거(모음)
                                 .replace("e", "")
                                 .replace("o", "")
                                 .replace("i", "")
                                 .replace("u", "");
        return answer;
    }
}