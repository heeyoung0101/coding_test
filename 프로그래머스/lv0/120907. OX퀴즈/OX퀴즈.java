class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length]; // 결과의 참, 거짓 여부를 담을 배열
        
        for(int i = 0; i < quiz.length; i++){
            String num1 = "";   // 연산할 숫자1
            String cal = "";    // 연산자
            String num2 = "";   // 연산할 숫자2
            String result = ""; // 결과값
            
            for(int j = 0; j < quiz[i].length(); j++){
                num1 += quiz[i].charAt(j); // 연산할 숫자1
                if(quiz[i].charAt(j + 1) == 32){ // 다음 문자가 공백일 때 
                    cal += quiz[i].charAt(j + 2); // 공백 다음의 문자를 연산자로 지정
                    for(int k = j + 4; k < quiz[i].length(); k++){
                        num2 += quiz[i].charAt(k); // 연산할 숫자2
                        if(quiz[i].charAt(k + 1) == 32){ // 다음 문자가 공백일 때
                            for(int l = k + 4; l < quiz[i].length(); l++){
                                result += quiz[i].charAt(l); // 결괏값
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            if("+".equals(cal)){ // 연산자가 + 일 때 덧셈
                if(Integer.parseInt(num1) + Integer.parseInt(num2) == Integer.parseInt(result)){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }        
            }else if("-".equals(cal)){ // 연산자가 - 일 때 뺄셈
                if(Integer.parseInt(num1) - Integer.parseInt(num2) == Integer.parseInt(result)){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}