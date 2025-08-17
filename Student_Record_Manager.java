// Students Record Manager
import java.util.Scanner;

public class Student_Record_Manager {
    public static void main(String[] args) {

        int sub1 , sub2 , sub3, sub4 , sub5 , total  ;
        float average;
        char grade = 0;

        Scanner ab = new Scanner(System.in);
        System.out.println("enter marks of subject1:");
        sub1 = ab.nextInt();
        System.out.println("enter marks of subject2:");
        sub2 = ab.nextInt();
        System.out.println("enter marks of subject3:");
        sub3 = ab.nextInt();
        System.out.println("enter marks of subject4:");
        sub4 = ab.nextInt();
        System.out.println("enter marks of subject5:");
        sub5 = ab.nextInt();
        total = sub1+sub2+sub3+sub4+sub5;
        average =(float) (total/5.0);


        if (average <=100 && average>=90){
            grade = 'A';
        }
        else if (average<90 && average>=70)
        {
            grade ='B';

        } else if (average<70 && average>=50)
        {
            grade ='C';
        }
        else if (average<50 && average>=33)
        {
            grade ='D';
        }
        else if (average<33 && average>=0)
        {
            grade ='E';
            System.out.println("You are failed in this Exam.");
        }


        System.out.println("You have scored "+total+" marks in this Exam");
        System.out.println("Your average Percentage is "+average+"%");
        System.out.println("Your Grade is : "+ grade);
    }
}