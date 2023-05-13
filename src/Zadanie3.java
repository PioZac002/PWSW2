import java.util.*;
public class Zadanie3 implements IZadanie{
    public void Start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj wymiar macierzy:");
        int n = scanner.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        // Wypełnij macierze losowymi liczbami od -10 do 10
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = random.nextInt(21) - 10;
                matrix2[i][j] = random.nextInt(21) - 10;
            }
        }

        System.out.println("Macierz 1:");
        printMatrix(matrix1);
        System.out.println("Macierz 2:");
        printMatrix(matrix2);

        int[][] sum = addMatrices(matrix1, matrix2);
        int[][] difference = subtractMatrices(matrix1, matrix2);
        int[][] product = multiplyMatrices(matrix1, matrix2);

        System.out.println("Suma macierzy:");
        printMatrix(sum);

        System.out.println("Różnica macierzy:");
        printMatrix(difference);

        System.out.println("Iloczyn macierzy:");
        printMatrix(product);
    }

    public int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
