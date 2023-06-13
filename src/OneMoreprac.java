import java.util.Scanner;

public class OneMoreprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy_n = n;
        int reverse = 0;
        while(copy_n >0){
            int rem = copy_n%10;
            reverse = reverse * 10 + rem;
            copy_n /=10;
        }
        boolean isPalindrome = (reverse == n);
        System.out.println(isPalindrome);
    }
}
