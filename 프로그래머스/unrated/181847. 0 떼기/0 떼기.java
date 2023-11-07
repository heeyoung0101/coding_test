class Solution {
    public String solution(String n_str) {
        String answer = "";
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) == '0'){
                continue; // 0이면 다음 인덱스
            }else{
                answer = n_str.substring(i); // 0이 아니면 해당 인덱스부터 끝까지 담은 새로운 문자열 생성
                break;
            }
        }
        return answer;
    }
}