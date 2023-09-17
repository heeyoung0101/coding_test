class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char c : myString.toCharArray()){
            answer += c == 'a' || c == 'A' ? 'A' : String.valueOf(c).toLowerCase();
        }
        return answer;
    }
}