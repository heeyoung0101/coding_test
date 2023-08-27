import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        List<Integer> numArr = new ArrayList<>(); // 일치번호 List
        int zeroCnt = 0; // 낙서된 번호
        int[] answer = new int[2]; // 최고순위, 최저순위
        
        for(int i : lottos){
            if(i == 0){
                zeroCnt++;
            }else{
                for(int j : win_nums){
                    if(i == j){
                        numArr.add(i); // 일치번호 
                    }
                }
            }
        }

        answer[0] = 7 - (zeroCnt + numArr.size()) < 6 ? 7 - (zeroCnt + numArr.size()) : 6; // 최고순위
        answer[1] = 7 - numArr.size() < 6 ? 7 - numArr.size() : 6; // 최저순위
        
        return answer;
    }
}