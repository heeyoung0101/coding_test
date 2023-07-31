class Solution {
    public int solution(int n, String control) {
        for(int i = 0; i < control.length(); i++){
            switch(control.charAt(i)){
                case 'w' : n += 1; // charAt은 char타입을 반환 ''로 묶어야 함
                    break;
                
                case 's' : n -= 1;
                    break;
                
                case 'd' : n += 10;
                    break;
                    
                case 'a' : n -= 10;
                    break;
                
                default : break;
            }
        }
        return n;
    }
}