package com.abhishek;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World! I'm new to Java");
//        System.out.println("Hey this is new line i guess");
//        System.out.println("Hey this is again a new line and it's actually  fun to learn Java");
       // System.out.print("Hello this is .print ");  //and here i am using print
       // System.out.println("And this is println between two print"); //and this will print on the same line because the previous line is using print
//        System.out.print(" this wouldn't  print on the same line \n"); //because previous line is using println
//        System.out.println("some numbers are on the nextline");
//        System.out.println(69);
//        System.out.println(69 + 69);

        String name = "Abhishek Kumar";
        final int age= 21;
        char grade = 'A';
        float weight = 61.5f;
        boolean des = true;
        grade = 'B';
        //age = 22; //this will throw an error bc i have used final keyword to protect age from overwriting
System.out.println(name + ", he is "+ age +" and he is a nice coder. His weight is "+ weight + " " +des);
        System.out.println(age + weight );

        int a= 1, b=2, c=3;
        System.out.println(a+b*c);

        int x,y,z;
        x=y=z=100;
        System.out.println(x+y+z);

       // String class = "8th";  //i can not use Java reserved words like class.
        String myClass = "8th";   //and this is right method.
        System.out.println(myClass);
    }

}
//hey coder MyNameIsAbhishek