import java.util.Scanner;

public class practic_task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width :");
        int w = in.nextInt();
        System.out.println("Enter height :");
        int h = in.nextInt();
        byte bb = -100;
        int[][] array = new int[h][w];
        for (int i = 0; i < h; i++) { //цикл для заполение рамки -100
            for (int j = 0; j < w; j++) {
                array[0][j] = bb; //первая строка
                array[i][0] = bb; //первый столбец
                array[h - 1][j] = bb;//последняя строка
                array[i][w - 1] = bb;//послюстолбец
                int body = 1000; //тело матрицы, начинается с 1000
                for (int ii = 1; ii < h - 1; ++ii) { //цикл для заполнения тела
                    for (int jj = 1; jj < w - 1; ++jj)
                        array[ii][jj] = body++;
                }
                System.out.print(array[i][j] + " ");//вывод елемента + пробел
            }
            System.out.println(); //переход на новую строку
        }
    }
}

