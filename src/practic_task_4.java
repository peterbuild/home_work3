import java.util.Scanner;

public class practic_task_4 {
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
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
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
    }
}
