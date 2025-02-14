import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Code cracker game");

        // Ask user to enter length of code
        Scanner askUserInput = new Scanner(System.in);
        System.out.println("Enter the length of the code you want to crack, Length can be only between 2 to 6 :");
        // Store it as userInput variable
        int userInput = askUserInput.nextInt();

        Scanner askUserGuess = new Scanner(System.in);


        if (userInput == 2) {
            int Max = 99;
            int Min = 10;
            int generatedCode = Min + (int)(Math.random() * ((Max - Min) + 1));
            System.out.println("Generated code is " + generatedCode);

            System.out.println("Code length is now " + userInput + ". Enter your guess: ");
            int guess = askUserGuess.nextInt();
//            System.out.println("Your guess: " + guess);



            ArrayList<Integer> digits = new ArrayList<>();
            while (generatedCode > 0) {
                digits.add(0, generatedCode % 10);
                generatedCode /= 10;
            }

            System.out.println("Correct characters found in");
            System.out.println(digits.indexOf(guess));



        } else if (userInput == 3) {
            int Max = 999;
            int Min = 100;
            int generatedCode = Min + (int)(Math.random() * ((Max - Min) + 1));
            System.out.println("Generated code is " + generatedCode);

        } else if (userInput == 4) {
            int Max = 9999;
            int Min = 1000;
            int generatedCode = Min + (int)(Math.random() * ((Max - Min) + 1));
            System.out.println("Generated code is " + generatedCode);

        } else if (userInput == 5) {
            int Max = 99999;
            int Min = 10000;
            int generatedCode = Min + (int)(Math.random() * ((Max - Min) + 1));
            System.out.println("Generated code is " + generatedCode);

        } else if (userInput == 6) {
            int Max = 999999;
            int Min = 100000;
            int generatedCode = Min + (int)(Math.random() * ((Max - Min) + 1));
            System.out.println("Generated code is " + generatedCode);

        } else {
            System.out.println("Invalid input");
        }





    }
}