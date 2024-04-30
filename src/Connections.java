/**********************************************************************
 * @file Group7Connections.java
 * @brief Initially had problems tracking wins and categories.
 * @author Anabelle Hessong, Elise Wood, Kyra Powell
 * @date: 04/30/2024
 * @acknowledgement: N/A
 ***********************************************************************/




/**
 * When someone uses our class to create a Connections game, four sets of word groups in random order will appear
 * in the console with  numbers. The user enters four numbers until they get all the answers.
 */
import java.util.Random;




public class Connections {
    //Declare and initialize string arrays
    private String[][] wordList = WordGroups();
    private String[][] game = fourCategories();
    private String[][] key = new String[4][4];




    /**
     * WordGroups method creates the 2D array with words in groups of 4 for each category
     */
    public String[][] WordGroups() {
        //Array of 18 categories of words
        wordList = new String[18][5];


        // Each row of five holds four words and one category name
        wordList[0][0] = "FOOT PARTS"; // Category titles will always be in the first column of each row
        wordList[0][1] = "BALL";
        wordList[0][2] = "SOLE";
        wordList[0][3] = "TOE";
        wordList[0][4] = "ARCH";


        wordList[1][0] = "KINDS OF WRENCHES";
        wordList[1][1] = "CRESCENT";
        wordList[1][2] = "MONKEY";
        wordList[1][3] = "SOCKET";
        wordList[1][4] = "ALLEN";


        wordList[2][0] = "FLABBERGAST";
        wordList[2][1] = "ROCK";
        wordList[2][2] = "SHOCK";
        wordList[2][3] = "SURPRISE";
        wordList[2][4] = "FLOOR";


        wordList[3][0] = "BIT OF JOURNALISM";
        wordList[3][1] = "FEATURE";
        wordList[3][2] = "REPORT";
        wordList[3][3] = "STORY";
        wordList[3][4] = "ARTICLE";


        wordList[4][0] = "DOG COMMANDS";
        wordList[4][1] = "DOWN";
        wordList[4][2] = "SIT";
        wordList[4][3] = "STAY";
        wordList[4][4] = "COME";


        wordList[5][0] = "ON THE SAME PLANE";
        wordList[5][1] = "FLAT";
        wordList[5][2] = "FLUSH";
        wordList[5][3] = "LEVEL";
        wordList[5][4] = "EVEN";


        wordList[6][0] = "BEAN ____";
        wordList[6][1] = "COUNTER";
        wordList[6][2] = "DIP";
        wordList[6][3] = "SPROUT";
        wordList[6][4] = "BAG";


        wordList[7][0] = "WHOLE AMOUNTS";
        wordList[7][1] = "GROSS";
        wordList[7][2] = "SUM";
        wordList[7][3] = "TOTAL";
        wordList[7][4] = "COUNT";


        wordList[8][0] = "DANCE MOVES";
        wordList[8][1] = "ROBOT";
        wordList[8][2] = "VOGUE";
        wordList[8][3] = "WORM";
        wordList[8][4] = "FLOSS";


        wordList[9][0] = "SINGLE/PLURAL ANIMALS";
        wordList[9][1] = "DEER";
        wordList[9][2] = "FISH";
        wordList[9][3] = "MOOSE";
        wordList[9][4] = "BUFFALO";


        wordList[10][0] = "GREAT ___";
        wordList[10][1] = "LAKE";
        wordList[10][2] = "SEAL";
        wordList[10][3] = "WHITE";
        wordList[10][4] = "DANE";


        wordList[11][0] = "UPDATE FOR ACCURACY";
        wordList[11][1] = "CORRECT";
        wordList[11][2] = "FIX";
        wordList[11][3] = "REVISE";
        wordList[11][4] = "AMEND";


        wordList[12][0] = "QUARREL";
        wordList[12][1] = "ROW";
        wordList[12][2] = "SCRAP";
        wordList[12][3] = "TIFF";
        wordList[12][4] = "FIGHT";


        wordList[13][0] = "GAMES OF CHANCE";
        wordList[13][1] = "LOTTERY";
        wordList[13][2] = "ROULETTE";
        wordList[13][3] = "WAR";
        wordList[13][4] = "BINGO";


        wordList[14][0] = "___ CHIP";
        wordList[14][1] = "COMPUTER";
        wordList[14][2] = "POKER";
        wordList[14][3] = "POTATO";
        wordList[14][4] = "BLUE";


        wordList[15][0] = "TRADEMARK";
        wordList[15][1] = "HALLMARK";
        wordList[15][2] = "STAMP";
        wordList[15][3] = "TRAIT";
        wordList[15][4] = "FEATURE";


        wordList[16][0] = "SEEN ON A GOLF COURSE";
        wordList[16][1] = "CART";
        wordList[16][2] = "CLUB";
        wordList[16][3] = "HOLE";
        wordList[16][4] = "TEE";


        wordList[17][0] = "BRING UP";
        wordList[17][1] = "NURSE";
        wordList[17][2] = "RAISE";
        wordList[17][3] = "REAR";
        wordList[17][4] = "FOSTER";
        return wordList;
    }




    /**
     * header method prints header before the connections game
     */
    public void header() {
        System.out.println("=====================================\n" + "Welcome to Connections!\n" + "Group words that share a common thread.\n" + "=====================================");
    }




    /**
     * closing prints closing message after game is over
     */
    public void closing() {
        System.out.println("=====================================\n" + "Thank you for playing Connections!\n" + "Rerun to play again\n" + "=====================================");
    }




    /**
     * printWords method receives array of words and prints the four categories of words in a random order, with 4 columns and rows
     */
    public void printWords(String[][] game) {
        int n = 4; // Define the size of the grid
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                System.out.printf("%-5s %-15s %8s \t", (i+1)+(y*4) + ".", game[i][y], ""); // Align words with numbers
            }
            System.out.println(); // Move to the next line after each row
        }
    }




    /**
     *  fourCategories method generates which four random categories will be given to the client in a single round
     */
    public String[][] fourCategories() {
        int a,b,c,d;
        b = 0; c = 0; d= 0;


        //initialize rand
        Random rand = new Random();
        // Picking the four categories through random number generation
        a = rand.nextInt(0,17);
        b = rand.nextInt(0,17);
        while(b == a){ // The following while loops ensure no categories are repeated
            b = rand.nextInt(0,17);
        }
        c = rand.nextInt(0,17);
        while(c == b || c == a){
            c = rand.nextInt(0,17);
        }
        d = rand.nextInt(0,17);
        while(d == c || d == b || d == a){
            d = rand.nextInt(0,17);
        }




        // Create an array holding only the selected word groups
        String[][] game = new String [4][5];




        // Store the selected categories in the first column of the array
        game[0][0] = wordList[a][0];
        game[1][0] = wordList[b][0];
        game[2][0] = wordList[c][0];
        game[3][0] = wordList[d][0];




        // Store the selected words in an array for game
        for(int i = 1; i < 5; i++){
            game[0][i] = wordList[a][i];
        }
        for(int i = 1; i < 5; i++){
            game[1][i] = wordList[b][i];
        }
        for(int i = 1; i < 5; i++){
            game[2][i] = wordList[c][i];
        }
        for(int i = 1; i < 5; i++){
            game[3][i] = wordList[d][i];
        }
        return game;
    }




    /**
     * Load method feeds 16 words to the client
     */
    public String[][] load(){
        //initialize and declare variables
        int locx, locy;
        String [][] layout = new String[4][4];
        Random rand = new Random();


        //for loop for four randomly selected categories of words to randomly select and store the location of each printed word
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 5; j++) {
                boolean placed = false;
                while (!placed) {
                    // Row and Column will be randomly generated and stored in locx and locy
                    locx = rand.nextInt(4);
                    locy = rand.nextInt(4);
                    // Ensure that the location is null so that each word is in a different stop
                    if (layout[locx][locy] == null) {
                        layout[locx][locy] = game[i][j];
                        // Place the corresponding category in the key
                        key[locx][locy] = game[i][0];
                        placed = true;
                    }
                }
            }
        }
        return layout;
    }


    /**
     * checkWin is called after four iterations of numbers are chosen by the
     client and checks to see if they
     * found a correct answer. If they did, the category name will be printed.
     * @param choice
     * @return
     */
    public boolean checkWin(int[] choice){
        String[] answers = new String[4];


        //store user input into answers array
        for(int i =0; i < 4; i++) {
            if (choice[i] == 0) {
                answers[i] = key[0][0];
            } else if (choice[i] == 1) {
                answers[i] = key[1][0];
            } else if (choice[i] == 2) {
                answers[i] = key[2][0];
            } else if (choice[i] == 3) {
                answers[i] = key[3][0];
            } else if (choice[i] == 4) {
                answers[i] = key[0][1];
            } else if (choice[i] == 5) {
                answers[i] = key[1][1];
            } else if (choice[i] == 6) {
                answers[i] = key[2][1];
            } else if (choice[i] == 7) {
                answers[i] = key[3][1];
            } else if (choice[i] == 8) {
                answers[i] = key[0][2];
            } else if (choice[i] == 9) {
                answers[i] = key[1][2];
            } else if (choice[i] == 10) {
                answers[i] = key[2][2];
            } else if (choice[i] == 11) {
                answers[i] = key[3][2];
            } else if (choice[i] == 12) {
                answers[i] = key[0][3];
            } else if (choice[i] == 13) {
                answers[i] = key[1][3];
            } else if (choice[i] == 14) {
                answers[i] = key[2][3];
            } else {
                answers[i] = key[3][3];
            }
        }


        //check if answers all belong in a category
        if(answers[0].equals(answers[1]) && answers[1].equals(answers[2]) && answers[2].equals(answers[3])){
            //if answers belong in the same category, inform user of win and print category name
            System.out.println("Correct! You found the category: " + answers[0] + "\n");
            return true;
        } else{
            //if user inputs do not belong in the same category, ask the user to try again and return to asking for numbers
            System.out.println("Try again!\n");
            return false;
        }
    }
}
