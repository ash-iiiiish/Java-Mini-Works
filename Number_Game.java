//Task 1 NUUMBER GAME
import java.util.Scanner;
import java.util.Random;


public class Number_Game {
    public static void main(String[] args) {

        int user_input , computer_input;

        Scanner ab = new Scanner(System.in);

       Random cd = new Random();

        computer_input = cd.nextInt(1,100);
       do {
           System.out.println("Enter your guess number in between 1 to 100 : ");
           user_input = ab.nextInt();
           int diff = computer_input-user_input;
           if (diff<0 && diff<=50)
           {
               System.out.println("You are too high.");

           } else if (diff>0 && diff>=50) {
               System.out.println("You are too low.");
           }
           else{
               System.out.println(
                       "you are close."
               );
           }
       }while (user_input!=computer_input);

        if (user_input == computer_input){
            System.out.println("You won the Guess ..Computer also guessed the same number as you did.");
        }
        else
        {
            System.out.println("Try again");
        }

    }
}
