
import javax.swing.*;
import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int max=0,min=0;
        int range = max - min + 1;
        System.out.println("Enter max and min number");
        max = s1.nextInt();
        min = s1.nextInt();

        int computerNumber = (int) (Math.random()*range)+1;
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between " +min+ " and "+max, "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ dGuess(userAnswer, computerNumber, count));
            count++;
        }  
    }

    public static String dGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}