class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer += str_list[i]; // 문자열에 ex 포함되지 않은 것 
            }
        }
        return answer;
    }
}