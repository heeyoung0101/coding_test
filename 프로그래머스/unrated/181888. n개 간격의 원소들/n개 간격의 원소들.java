import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < num_list.length; i += n){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray(); 
        // Integer List를 int 배열로 변환할 때
        // 1. list를 stream으로 변환 
        // 2. 모든 Integer 요소를 intValue() 메서드를 사용해 int로 변환 
        // 3. array로 만듦
        
    }
}