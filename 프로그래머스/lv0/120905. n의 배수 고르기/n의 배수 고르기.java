import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length];
        int index = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                arr[index++] = numlist[i]; // index는 numlist의 원소가 n의 배수일 때만 사용 후 증가
            }
        }
        
        int[] answerArr = Arrays.copyOfRange(arr, 0, index); // 값이 0이 아닌 요소만 나오도록 배열 자르기
        
        return answerArr;
    }
}