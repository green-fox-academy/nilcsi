import java.util.Arrays;

public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String args[]) {

        int size = 4;
        int[][] myArray = new int[size][size];

        for(int i = 0; i< size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.println(Arrays.deepToString(myArray));
            }
        }

    }
}
