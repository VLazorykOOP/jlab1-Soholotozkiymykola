import java.util.Scanner;

public class frrfefefe {
    
    // Метод для видалення середньої літери у слові з непарною кількістю символів
    public static String removeMiddleCharacter(String word) {
        int length = word.length();
        if (length % 2 == 1) { // перевіряємо чи непарна довжина
            int middleIndex = length / 2;
            // видаляємо середню літеру
            return word.substring(0, middleIndex) + word.substring(middleIndex + 1);
        }
        return word;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введіть текст:");
        String input = sc.nextLine();
        
        // Розбиваємо текст на слова, враховуючи розділові знаки
        String[] words = input.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            // Видаляємо середню літеру, якщо слово має непарну кількість літер
            String modifiedWord = removeMiddleCharacter(word);
            result.append(modifiedWord).append(" ");
        }
        
        // Виводимо результат
        System.out.println("Модифікований текст:");
        System.out.println(result.toString().trim());
    }
}
