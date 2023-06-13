import java.util.*;

//class Accio {
//
//    static int triangle(int a, int b, int c){
//        int res = 0;
//        int max = Math.max(a, Math.max(b,c));
//        int max2 = max*max;
//        int sum = (a*a) + (b*b) + (c*c) - (max *max);
//        if(max2 < sum){
//            res = 1;
//        } else if (max2 == sum) {
//           res = 2;
//        } else{
//            res = 3;
//        }
//        return res;// write your code here
//    }
//}
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println(1);
        } else if (x<0 && y<0) {
            System.out.println(3);
        } else if (x>0 && y<0) {
            System.out.println(4);
        } else{
            System.out.println(2);
        }


//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i; j++) {
//                System.out.print(" # ");
//            }
//
//            System.out.println();
//        }
//        int a,b,c;
//        a = sc.nextInt();
//        b= sc.nextInt();
//        c= sc.nextInt();
//        Accio Obj = new Accio();
//        int result = Obj.triangle(a,b,c);
//        System.out.print(result);
//        long sum = 0;

//        int n=sc.nextInt();
//        int copy_n = n;
//        int copy_n2 = n;
//        char star = '*';
//        while(copy_n >0){
//            System.out.print(star + " ");
//            copy_n = copy_n -1;
//        }
//        System.out.println();
//        while(copy_n2> 0){
//            System.out.println(star);
//            copy_n2 = copy_n2 -1;
//        }

//        int year = sc.nextInt();
//            System.out.println();
//            if (year % 4 == 0 && (year%100 != 0 || year%400 == 0)) {
//                System.out.println(1);
//            } else {
//                System.out.println(0);
//            }

//        Solution.isArmstrongOrNot(N);
        //    static class Solution {
//        static void isArmstrongOrNot(int n) {
//            int copy_n = n;
//            int sum = 0;
//            while(copy_n>0){
//                int r = copy_n%10;
//                sum = sum + r*r*r;
//                copy_n = copy_n/10;
//            }
//
//            if(sum == n){
//                System.out.println(sum);
//            }
//            else{
//                System.out.println(0);
//            }
//        }
//    }
    }
}
