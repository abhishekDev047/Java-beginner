import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args){
        System.out.println("Hey this is day 3 of learning Java");
        Scanner user = new Scanner(System.in);
//        This is practice set.
//        problem one

//        System.out.println("ok let's add 3 numbers , enter number one ");
//        int a = user.nextInt();
//        System.out.println("now enter number two");
//        int b = user.nextInt();
//        System.out.println("and at last enter number three");
//        int c = user.nextInt();
//        long sum = a+b+c;
//        System.out.println("So here is the sum of these three numbers :");
//        System.out.println(sum);

        // now let's solve  the second,third,fourth problems
//        String name = user.nextLine();
//        System.out.println("Hello " + name+ ",have a good day.");

//        System.out.println("Enter Kilometers here");
//        int km = user.nextInt();
//        int mt = km * 1000;
//        System.out.println(km + " is equal to " + mt + " meters");

//        boolean num = user.hasNextInt();
//        System.out.println(num);


//        now here we got some daily learning

        //Precedence and associativity
        int sum = 5*5+15/5; //here * will execute first because here associativity is working
        int num = 25/5 - 5*5; // here is also associativity is working and this time / will execute first.
        int lum = 5+ 5 *10 ; //and here precedence is working and * will execute first because it has more precedence value than others
        System.out.println(sum);
        System.out.println(num);
        System.out.println(lum);
    }
}
