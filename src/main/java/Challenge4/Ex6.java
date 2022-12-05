package Challenge4;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessCount = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("---Guess My Number Game---");

        do {


            System.out.println("\nGuess: ");

            guess = scanner.nextInt();
            guessCount ++;

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }

            else if (guess > randomNumber) {
                System.out.println("LOWER");
            }

            else {

                System.out.println("Correct. My number was" + " " + randomNumber + ".");
                System.out.println("You got it in " + guessCount + " " + "guesses.");
            }

        } while (guess!= randomNumber);






    }





}
