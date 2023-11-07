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

    // 다른 사람 풀이
    public String solution2(String n_str) {
        return "" + Integer.parseInt(n_str); // 정수로 변환하면서 앞에 붙은 0은 저절로 사라짐
    }
}