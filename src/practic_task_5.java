import java.util.Scanner;

public class practic_task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width :");
        int w = in.nextInt();
        System.out.println("Enter height :");
        int h = in.nextInt();
        for (int i = 0; i < w; i++){
            for (int j = 0; j < h; j++){
                System.out.print("+"); //рисуем ряд
            }
            System.out.println(); //новый ряд
        }
    }
}
