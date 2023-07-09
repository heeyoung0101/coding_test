import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print(str);
        }
    }
}

/** 다른 사람의 풀이 
  - 문자열을 반복하는 메서드 사용 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n)); // 문자열(str)을 n번 반복한 것을 출력
    }
}
