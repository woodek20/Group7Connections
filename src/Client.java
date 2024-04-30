import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        // Declare and initialize variables
        Connections connect = new Connections();
        boolean isGameOver = false; // Used to stop the game
        int count = 0; // Used to count categories found
        String[][] board;
        String[][] gameKey;
        boolean correctAnswer = false;


        // call header method to print a welcome message
        connect.header();

        //calling load method to create random display of words
        board = connect.load();


        // print list of 16 words initially
        connect.printWords(board);
        System.out.println("\nInstructions: Create four groups of four by entering your choices one at a time with the corresponding number.\n");


        // while loop to run the game and check for wins until the game is over (4/4 categories correct)
        while (!isGameOver) {
            // Declare and initialize variables
            int i = 0;
            int n = 4;
            int[] userChoice = new int[n];
            Scanner scanner = new Scanner(System.in);


            // ask the user for 4 numbers
            for (i = 0; i < n; i++) {
                System.out.print("Enter a number 1-16: ");
                userChoice[i] = scanner.nextInt() - 1;  // the - 1 makes the user input of 1 for example, match the array 0.
                // if userChoice is outside of 0 to 15 range, ask again
                while (userChoice[i] < 0 || userChoice[i] > 15) {
                    System.out.print("Invalid input. Enter a number between 1-16: ");
                    userChoice[i] = scanner.nextInt() - 1;
                }
            }
            // Once four valid answers are collected, check for a win
            correctAnswer = connect.checkWin(userChoice);


            // increase correct category count for each correct answer set
            if (correctAnswer) {
                count++;
                // check if all four categories have been found
                if (count == 4) {
                    System.out.println("\nAll four categories found.");
                    isGameOver = true;
                }
                else {
                    // reprint the list of words after finding a category
                    System.out.println("\nFind the next category from the list: \n");
                    connect.printWords(board);
                }
            }
        }
        // Print closing method once the game is over
        connect.closing();
    }
}

