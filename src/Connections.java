import java.awt.*;
import java.util.ArrayList;

public class Connections {

    final static int BOX_SIZE = 100;
    final static int WINDOW_SIZE = 4 * (BOX_SIZE) + 6;
    //private ArrayList<String> words;

    private String [] categories;
    private String[][] wordList;

    public static void main(String[] args) {
    // When someone uses our class to create a Connections game, a board with four sets of word groups in random order will appear

        DrawingPanel panel = new DrawingPanel(WINDOW_SIZE, WINDOW_SIZE);
        Graphics g = panel.getGraphics();

        panel.onMouseClick(
                (x, y) -> {
                    handleClick(g, x, y);
                }
        );
    }

    // This method creates the 3D array with all of the groups of words
    public String[][] WordGroups(){
        wordList = new String[17][4];
        wordList[0][0] = "ARCH";
        wordList[0][1] = "BALL";
        wordList[0][2] = "SOLE";
        wordList[0][3] = "TOE";
        wordList[1][0] = "ALLEN";
        wordList[1][1] = "CRESCENT";
        wordList[1][2] = "MONKEY";
        wordList[1][3] = "SOCKET";
        wordList[2][0] = "FLOOR";
        wordList[2][1] = "ROCK";
        wordList[2][2] = "SHOCK";
        wordList[2][3] = "SURPRISE";
        wordList[3][0] = "ARTICLE";
        wordList[3][1] = "FEATURE";
        wordList[3][2] = "REPORT";
        wordList[3][3] = "STORY";
        wordList[4][0] = "COME";
        wordList[4][1] = "DOWN";
        wordList[4][2] = "SIT";
        wordList[4][3] = "STAY";
        wordList[5][0] = "EVEN";
        wordList[5][1] = "FLAT";
        wordList[5][2] = "FLUSH";
        wordList[5][3] = "LEVEL";
        wordList[6][0] = "BAG";
        wordList[6][1] = "COUNTER";
        wordList[6][2] = "DIP";
        wordList[6][3] = "SPROUT";
        wordList[7][0] = "COUNT";
        wordList[7][1] = "GROSS";
        wordList[7][2] = "SUM";
        wordList[7][3] = "TOTAL";
        wordList[8][0] = "FLOSS";
        wordList[8][1] = "ROBOT";
        wordList[8][2] = "VOGUE";
        wordList[8][3] = "WORM";
        wordList[9][0] = "BUFFALO";
        wordList[9][1] = "DEER";
        wordList[9][2] = "FISH";
        wordList[9][3] = "MOOSE";
        wordList[10][0] = "DANE";
        wordList[10][1] = "LAKE";
        wordList[10][2] = "SEAL";
        wordList[10][3] = "WHITE";
        wordList[11][0] = "AMEND";
        wordList[11][1] = "CORRECT";
        wordList[11][2] = "FIX";
        wordList[11][3] = "REVISE";
        wordList[12][0] = "FIGHT";
        wordList[12][1] = "ROW";
        wordList[12][2] = "SCRAP";
        wordList[12][3] = "TIFF";
        wordList[13][0] = "BINGO";
        wordList[13][1] = "LOTTERY";
        wordList[13][2] = "ROULETTE";
        wordList[13][3] = "WAR";
        wordList[14][0] = "BLUE";
        wordList[14][1] = "COMPUTER";
        wordList[14][2] = "POKER";
        wordList[14][3] = "POTATO";
        wordList[15][0] = "FEATURE";
        wordList[15][1] = "HALLMARK";
        wordList[15][2] = "STAMP";
        wordList[15][3] = "TRAIT";
        wordList[16][0] = "BLOOM";
        wordList[16][1] = "BUD";
        wordList[16][2] = "SHOOT";
        wordList[16][3] = "SPROUT";
        wordList[17][0] = "FOSTER";
        wordList[17][1] = "NURSE";
        wordList[17][2] = "RAISE";
        wordList[17][3] = "REAR";
        return wordList;
    }

    private static void handleClick(Graphics g, int x, int y) {
        int row, col;
        // Obtain the row, col for the box clicked
        row = y / BOX_SIZE;
        col = x / BOX_SIZE;
        // Obtain the coordinate of the box
        int yTop = row * BOX_SIZE + 3;
        int xTop = col * BOX_SIZE + 3;
        System.out.printf("(row, col) = (%d, %d)\n", row, col);
        }

    }

    private void drawBoard(Graphics g) {
        int i, j;
        j = (WINDOW_SIZE - 6) / 3; // Subtracted six to leave a small margin around the board

        for (i=0; i < 4; i++){
            g.drawLine( j * i + 3, 3, j * i + 3, WINDOW_SIZE - 3);
            g.drawLine(3,j * i + 3, WINDOW_SIZE - 3, j * i + 3);
        }
    }
}