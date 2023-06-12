import java.util.Scanner;

//adding custom class
class Portal {
    public void print(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}

public class PracticeSet2 {
    public static void main(String[] args) {
        //conditionals in java (if else)
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age<18){
//            System.out.println("No you cannot drive");
//        }
//        else{
//            System.out.println("Yes you can drive");
//        }
         Portal harry = new Portal();
        harry.print("Abhishek",21);
        harry.print("John", 69);
    }
}
