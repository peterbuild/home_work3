import java.util.Scanner;

public class practic_task_2 {
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
        System.out.println("Reverse: ");
        for (int i = array.length - 1; i >= 0; i--) System.out.print(array[i] + " ");
    }
}
