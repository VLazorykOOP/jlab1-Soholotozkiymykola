import java.util.Scanner;

public class MatrixRowEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Введення розміру матриць
        System.out.print("Введіть розмір матриць n (≤ 15): ");
        int n = sc.nextInt();
        
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[] X = new int[n];  // Вектор результату
        
        // Введення елементів матриці A
        System.out.println("Введіть елементи матриці A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        // Введення елементів матриці B
        System.out.println("Введіть елементи матриці B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        
        // Обчислення вектора X
        for (int i = 0; i < n; i++) {
            boolean rowsAreEqual = true;
            for (int j = 0; j < n; j++) {
                if (A[i][j] != B[i][j]) {
                    rowsAreEqual = false;
                    break;
                }
            }
            X[i] = rowsAreEqual ? 1 : 0;
        }
        
        // Виведення результату
        System.out.println("Вектор X:");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }
    }
}
