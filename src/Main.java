import java.util.Scanner;

public class Main {

    // Метод для обчислення результату на основі двох чисел n і m
    public static double calculate(double n, double m) {
        // Обчислення першого дробу: (n + 1) / (m + 2)
        double num1 = n + 1;
        double denum1 = m + 2;
        double frac1 = num1 / denum1;
        
        // Обчислення другого дробу: 5 / (n - m)
        double num2 = 5;
        double denum2 = n - m;
        double frac2 = num2 / denum2;

        // Обчислення суми квадратів дробів
        double grade = (frac1 + frac2) * (frac1 + frac2);
        
        // Обчислення кінцевого результату, який є добутком grade, n і m
        double result = grade * n * m;
        return result; // Повертаємо результат
    }

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для введення даних з клавіатури
        Scanner sc = new Scanner(System.in);
        
        // Запитуємо користувача ввести значення для змінної х
        System.out.println("Введiть значення х: ");
        double x = sc.nextDouble();
        
        // Запитуємо користувача ввести значення для змінної у
        System.out.println("Введiть значення у: ");
        double y = sc.nextDouble();
  
        // Викликаємо метод calculate з введеними значеннями x та y
        double result = calculate(x, y);
  
        // Виводимо результат обчислень
        System.out.println("Результат: ");
        System.out.println(result);
    }
}
