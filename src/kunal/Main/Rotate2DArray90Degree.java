package kunal.Main;

public class Rotate2DArray90Degree {

    static int N = 4;

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int mat[][] = {
                {1, 2},
                {4, 5}
        };

        printMatrix(arr);
        rotate90DegreeClockWise(N, arr);
        System.out.println("");
        printMatrix(arr);

        System.out.println();

        /*printMatrix(mat);
        rotate90DegreeClockWise(N, mat);
        System.out.println("");
        printMatrix(mat);*/
    }

    private static void rotate90DegreeClockWise(int n, int[][] arr) {

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = temp;
            }
        }
    }

    private static void printMatrix(int[][] arr) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
