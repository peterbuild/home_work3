import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size: "); //запрашиваем размер
        int size = in.nextInt();
        //Вводим массив
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input " + i + " element");
            array[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int rep5 = 0;
        //запускаем цикл для прогонки всех елементов
        for (int i = 0; i < size; i++) {
            min = Math.min(min, array[i]); //опр.макс
            max = Math.max(max, array[i]); //опр мин.
            if (array[i]==5) rep5++; // считаем повторение 5
        }
        //выводим 
        System.out.println("Min. element = " + min);
        System.out.println("Max. element = " + max);
        System.out.println("Repeat 5     = " + rep5);

    }
}
