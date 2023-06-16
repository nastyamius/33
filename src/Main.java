import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();

        int[][] collection = new int[rows][columns];
        Random random = new Random();

        // заполнение коллекции случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                collection[i][j] = random.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxRow = 0;
        int maxColumn = 0;
        int minRow = 0;
        int minColumn = 0;

        // поиск максимального и минимального значения с индексами ячеек
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (collection[i][j] > max) {
                    max = collection[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
                if (collection[i][j] < min) {
                    min = collection[i][j];
                    minRow = i;
                    minColumn = j;
                }
            }
        }

        System.out.println("Максимальное значение: " + max + ", индексы ячейки: [" + maxRow + "][" + maxColumn + "]");
        System.out.println("Минимальное значение: " + min + ", индексы ячейки: [" + minRow + "][" + minColumn + "]");
    }
}