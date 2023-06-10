import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //This function shows the percentage of marks obtained in 5 subs, and also can be edited to calculate more than 5 subjects
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the total marks of a single subject ");
        int totalMarksInput = userInput.nextInt();
        int totalMarks = totalMarksInput * 5;
        System.out.println("enter marks obtained in subject 1");
        int s1 = userInput.nextInt();
        System.out.println("enter marks obtained in subject 2");
        int s2 = userInput.nextInt();
        System.out.println("enter marks obtained in subject 3");
        int s3 = userInput.nextInt();
        System.out.println("enter marks obtained in subject 4");
        int s4 = userInput.nextInt();
        System.out.println("enter marks obtained in subject 5");
        int s5 = userInput.nextInt();
        int marksObtained = s1+s2+s3+s4+s5;
        float calc = (float) marksObtained/totalMarks;
        float percentage = calc * 100;
        System.out.println("Your total obtained marks are: " + marksObtained);
        System.out.println("And your percentage is: " + percentage);
    }
}
