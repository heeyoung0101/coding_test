class Solution {
    public int solution(String my_string, String is_prefix) {
        if(is_prefix.length() <= my_string.length()){ // 접두사가 문자열 길이와 작거나 같은지 확인
            for(int i = 0; i < is_prefix.length(); i++){
                if(my_string.charAt(i) != is_prefix.charAt(i)){ // 인덱스 0부터 값이 같은지 비교
                    return 0;
                }
            }
        }else{
            return 0;
        }
        return 1;
    }

    /* 다른 사람 풀이 */
    public int solution2(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) return 1; // startsWith : 해당 문자열로 시작하는지, endsWith : 해당 문자열로 끝나는지
        return 0;
    }
}