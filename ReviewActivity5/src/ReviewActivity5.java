import java.io.*;

public class ReviewActivity5 {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        // assigning variables
        int userGuess = 0, count = 0;

        // prompting use to write a number between 1 and 6
        System.out.print("Enter a number between 1 and 6: ");
        userGuess = Integer.parseInt(input.readLine());

        //bullet proofing user guess input
        while (userGuess < 1 || userGuess > 6) {
            System.out.print("invalid input, please enter a number between 1 and 6: ");
            userGuess = Integer.parseInt(input.readLine());
        }

        // generate a random integer between 1 and 6
        int random_int = (int)(Math.random() * (6 - 1 + 1) + 1);
        
        // bullet proofing 
        while (random_int != userGuess) {
            count = count + 1;
            random_int = (int)(Math.random() * (6 - 1 + 1) + 1);
            //The count++ acts weirdly for me
        }
        System.out.println();
        System.out.println("The user's guess is " + userGuess + " and it took the computer " + count + " guesses to match the user's guess!");

    }
}
