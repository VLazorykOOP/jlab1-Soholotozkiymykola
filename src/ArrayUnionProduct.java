import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayUnionProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Введення розміру масивів
        System.out.print("Введіть кількість елементів n (≤ 300): ");
        int n = sc.nextInt()-1;
        
        int[] X = new int[n];
        int[] Y = new int[n];
        
        // Введення елементів масиву X
        System.out.println("Введіть елементи масиву X:");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }
        
        // Введення елементів масиву Y
        System.out.println("Введіть елементи масиву Y:");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }
        
        // Використовуємо Set для збереження унікальних елементів
        Set<Integer> unionSet = new HashSet<>();
        
        // Додаємо елементи з масиву X
        for (int i = 0; i < n; i++) {
            unionSet.add(X[i]);
        }
        
        // Додаємо елементи з масиву Y
        for (int i = 0; i < n; i++) {
            unionSet.add(Y[i]);
        }
        
        // Обчислюємо добуток елементів об'єднання
        long product = 1;
        long sum = 0;
        System.out.println("Елементи об'єднання:");
        for (int element : unionSet) {
            System.out.print(element + " ");
            product *= element;
            sum += element;
        }
        
        System.out.println("\nДобуток елементів об'єднання: " + product);
        System.out.println("Сума елементів об'єднання: " + sum);
    }
}
