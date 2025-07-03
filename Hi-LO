import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);

       int guess;
       int attempts = 0;
       int randomNumber = random.nextInt(1,101);
        System.out.println(" ====== 😄 NUMBER GUESSING GAME 😄 ======");

        do {
            System.out.print("Enter the number between 1 - 100: ");
            guess = scanner.nextInt();
            if(guess < randomNumber){
                System.out.println("TOO LOW! TRY AGAIN! 😒");
            }else if(guess > randomNumber){
                System.out.println("TOO HIGH! TRY AGAIN! 🤭");
            }
            attempts++;
        }while( guess != randomNumber);

        System.out.println("You've got this 💪");
        System.out.println("The number of trials is " + attempts);
       scanner.close();

    }
}
