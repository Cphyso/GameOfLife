import java.util.Arrays;

public class GameOfLife {

    public static void main(String[] args) {

        int[][] x = new int[10][10];

        int[] a = {0, 1, 1, 0, 1, 0, 1, 0, 0, 1};
        int[] b = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] c = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] d = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] e = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] f = {1, 0, 0, 1, 0, 0, 0, 0, 0, 1};
        int[] g = {1, 0, 0, 1, 0, 0, 0, 0, 0, 1};
        int[] h = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] l = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        int[] m = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};


        x = new int[][]{a, b, c, d, e, f, g, h, l, m};
// printing 1st generation
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
        // printing 2nd generation
        for (int i = 1; i < 8; i++) {
            int j;
            for (j = 1; j < 8; j++) {

                int pos1 = x[i - 1][j - 1];
                int pos2 = x[i - 1][j];
                int pos3 = x[i - 1][j + 1];
                int pos4 = x[i][j - 1];
                int pos5 = x[i][j + 1];
                int pos6 = x[i + 1][j - 1];
                int pos7 = x[i + 1][j];
                int pos8 = x[i + 1][j + 1];

                int[] positions = new int[]{pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8};
                int counter = 0;

                for (int k = 0; k < positions.length; k++) {
                    if (positions[k] == 1) {
                        counter++;
                    }
                }
                if(counter < 2 && x[i][j]== 1) {
                    //  System.out.println("less than two");
                    x[i][j] = 0;
                }else if (counter >= 2 && counter <= 3 && x[i][j]== 1){
                    //  System.out.println("more than 2 less than 3");
                    x[i][j] = 1;
                }else if (counter>3 && x[i][j] == 1){
                    //  System.out.println("more than three");
                   x[i][j] = 0;
                }else if(counter == 3 && x[i][j] == 0){
                   // System.out.println("equals to three");
                    x[i][j] = 1;
                }
            }
        }
        System.out.println();
        System.out.println("printing 2nd generation");
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
//todo change input to # and *
//todo handle lives on the edge of the board
//todo randomize creation of first generation