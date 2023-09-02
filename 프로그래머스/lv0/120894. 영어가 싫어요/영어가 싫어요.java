import java.util.Map;
import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        String number = "";
        String answer = "";
        
        // 각 알파벳에 맞는 숫자 map에 넣기
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        for(int i = 0; i < numbers.length(); i++){
            number += numbers.charAt(i);
            if(map.containsKey(number)){ // number가 map의 key와 일치할 때, 해당 숫자를 answer에 더하기 
                answer += map.get(number);
                number = "";
            }
        }

        return Long.parseLong(answer);
    }
}