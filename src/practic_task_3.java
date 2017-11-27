import java.util.Scanner;

public class practic_task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first array size: "); //запрашиваем размер 1
        int size = in.nextInt();
        //Вводим массив
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input " + (i + 1) + " element of " + size);
            array[i] = in.nextInt();
        }
        System.out.println("Input second array size: "); //запрашиваем размер 2
        int size1 = in.nextInt();
        //Вводим массив
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Input " + (i + 1) + " element of " + size1);
            array1[i] = in.nextInt();
        }
            int[] arraySum = new int[Math.max(size,size1)]; // создаем массив сумм с максимальным введенным размером

            for (int i = 0; i < Math.max(size, size1); i++ ){ //цыкл по максимальному размеру
                if (i < Math.min(size,size1))
                    arraySum[i] = array[i] + array1[i]; //суммируем пока массивы равны
                else if (size > size1)
                     arraySum[i] = array[i]; //если елемент отсутствует во втором массиве
                else if (size < size1)
                     arraySum[i] = array1[i];//если елемент отсутствует в первом массиве
            }
            //вывод
        System.out.println("Sum first and second array: ");
        for (int i:arraySum)
            System.out.print(i + " ");
    }

}

