class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = strlist[i].length(); // 문자열의 길이 .length() / 배열은 .length
        }
        return answer;
    }
}