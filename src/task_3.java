import java.util.Arrays;
import java.util.Scanner;

public class task_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the array with a space");
        String str = in.nextLine();
        String array_row[] = str.split(" "); // создаем масив строк разделенный пробелами
        int[] array = new int[array_row.length];   // создаем int массив размером на основании строкового
        //заполняем данными через парсер со строкового массива в интовый
        for (int i = 0; i < array_row.length; i++) {
            array[i] = Integer.parseInt(array_row[i]);
        }
        // или же так, но не совсем понимаю как работает)))
        int[] array1 = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(array); //Сортировка его
        //Arrays.sort(array1);
        System.out.println("Sorted: ");
        for (int i:array) System.out.print(i + " ");
        System.out.println();
        //for (int i:array1) System.out.print(i + " ");
    }
}
