class Solution {
    public int solution(int price) {
        
        int answer = 0;
        /* answer = price로 초기화 후 answer *= 4 / 5를 실행하면, 4 / 5가 먼저 연산되며 0이되기 때문에 결과가 달라진다. */
        if(price >= 500000){
            answer = price * 4 / 5; // 20퍼 할인
        }else if(price >= 300000){
            answer = price * 9 / 10; // 10퍼 할인
        }else if(price >= 100000){
            answer = price * 19 / 20; // 5퍼 할인
        }else{
            answer = price;
        }
        
        return answer;
    }
}