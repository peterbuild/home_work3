import java.util.Arrays;
import java.util.Scanner;

public class task_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size: "); //запрашиваем размер
        int size = in.nextInt();
        //Вводим массив
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input " + (i + 1) + " element of " + size);
            array[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE; //присвоим максималное значение типа
        int max = Integer.MIN_VALUE; // минимальное
        int rep5 = 0;
        //запускаем цикл для прогонки всех елементов
        for (int i = 0; i < size; i++) {
            min = Math.min(min, array[i]); //опр.макс
            max = Math.max(max, array[i]); //опр мин.
            if (array[i]==5) rep5++; // считаем повторение 5
        }

        //Arrays.sort(array); //Сортировка встроенным методом-----------------------------

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //---------------------------------------------------------------
        System.out.println("Sorted array: ");
        for (int i:array)
            System.out.print(i + " "); //Выводим масив в консоль
        System.out.println();
        //Макс число повторений елементов задание №2-------------------------
        int[] array_counter = new int[array.length]; //создаем вспомогательный массив

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    array_counter[i]++;
            }
        }
        int max_count = 1;
        int min_count = array_counter[0]; //берем за минимум первый елемент
        for (int i = 0; i < array.length; i++) {
            max_count = Math.max(max_count, array_counter[i]);
            min_count = Math.min(min_count, array_counter[i]);
        }
        for (int i = 0; i < size; i++)
            System.out.print(array_counter[i] + " "); //Выводим масив в консоль
        //выводим
        System.out.println();
        if (min != max){
            System.out.println("Min. element = " + min);
            System.out.println("Max. element = " + max);
        } else System.out.println("All elements of the array = " + array[0]);

        System.out.println("Repeat 5     = " + rep5);
        System.out.println("Max number of repetitions = " + max_count);

        if (min != max)
            System.out.println("Min number of repetitions = " + min_count);



    }
}
