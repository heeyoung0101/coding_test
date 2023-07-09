import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String evenOrOdd = "";
        evenOrOdd += (n % 2 == 0) ? "even" : "odd"; // 이거 아님 저거일 때 사용
        
        System.out.printf("%d is %s", n, evenOrOdd);
    }
}