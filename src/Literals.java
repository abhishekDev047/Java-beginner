import java.util.Scanner;
public class Literals {
    public  static  void main(String[] args){
//        System.out.println("Hey this is day two of learning JAVA");
        byte age = 127;   // byte cannot be more than 127 or smaller than -128
//        System.out.println(age);
        short num = 334;
        int num2 = 4343434;
        long num3 = 8574375737676767765L;
        long num4 = 5894029384756L;

        // ok let's learn about user input
Scanner userInput = new Scanner(System.in);
        System.out.println("please enter your first number");
        int a = userInput.nextInt();
        System.out.println("and now enter 2nd number");
        int b = userInput.nextInt();
        long sum = a+b;
        System.out.println("The sum of these numbers are : " + sum);

        boolean bool = userInput.hasNextInt();
        System.out.println(bool);

    }
}
