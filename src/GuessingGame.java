import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static final int MAX_VALUE = 100;
    
    public static int getRandomAnswer(Random r) {
        return r.nextInt(GuessingGame.MAX_VALUE) + 1;
    }
    
    public static void printGreeting() {
        System.out.println("This program allows you to guess random numbers.");
        System.out.println("I will think of a number between 1 and " + GuessingGame.MAX_VALUE);
        System.out.println("and you will try to guess it.");
        System.out.println("After each guess, I will give you a clue about");
        System.out.println("whether the correct number is higher or lower.");
    }
    
    public static void main(String[] args) {
        printGreeting();
        
        Scanner stdin = new Scanner(System.in);
        Random r = new Random();
        boolean play = true;
        boolean correct = false;
        String response;
        int guess, ans, guesses, totalGames = 0, totalGuesses = 0, bestGame = Integer.MAX_VALUE;
        while (play) {
        	correct = false;
            guesses = 0;
            totalGames++;
            ans = getRandomAnswer(r);
            System.out.println();
            System.out.println("I'm thinking of a number between 1 and " + GuessingGame.MAX_VALUE + "...");
            while (!correct) {
                System.out.print("Your guess? ");
                guess = Integer.parseInt(stdin.nextLine());
                guesses++;
                totalGuesses++;
                if (guess == ans) {
                    if (guesses == 1) {
                        System.out.println("You got it right in 1 guess!");
                    } else {
                        System.out.println("You got it right in " + guesses + " guesses!");
                    }
                    if (guesses < bestGame) {
                        bestGame = guesses;
                    }
                    correct = true;
                } else {
                    if (guess < ans) {
                        System.out.println("It's higher.");
                    } else {
                        System.out.println("It's lower.");
                    }
                }
            }
            System.out.print("Do you want to play again? ");
            response = stdin.nextLine();
            if (!String.valueOf(response.charAt(0)).toLowerCase().equals("y")) {
                play = false;
            }
        }
        System.out.println();
        System.out.println("Overall results:");
        System.out.println("Total games   = " + totalGames);
        System.out.println("Total guesses = " + totalGuesses);
        System.out.printf("Guesses/game  = %.1f\n", ((double)totalGuesses/totalGames));
        System.out.println("Best game     = " + bestGame);
        
        stdin.close();
    }
}