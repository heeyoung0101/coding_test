class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String str : dic){
            if(str.length() != spell.length){
                continue; // spell의 길이와 dic 단어의 길이가 같지 않다면 다음 반복문으로 
            }else{
                int count = 0;
                for(int i = 0; i < str.length(); i++){
                    if(str.indexOf(spell[i]) < 0){ // dic 단어에 spell의 원소의 인덱스가 존재하지 않으면 반복문 나가기
                        break;
                    }else{
                        count++; 
                    }
                }
                if(count == str.length()) return 1; // dic 단어의 스펠링이 모두 spell의 원소로 이루어져있음
            }
        }
        return 2;
    }
}