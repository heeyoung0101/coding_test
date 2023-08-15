import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int start, int end) {
        List<Integer> list = new ArrayList<>(); // List<Integer> : 정수형 타입으로만 이루어진 List
        for(int i = start; i >= end; i--){
            list.add(i);
        }
        return list;
    }
}