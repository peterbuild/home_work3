import java.util.Scanner;

public class practic_task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        String a = new StringBuffer(in.nextLine()).reverse().toString();
        System.out.println("Enter second number :");
        String b = new StringBuffer(in.nextLine()).reverse().toString();

        System.out.println("First reverse: " + a);
        System.out.println("Second reverse: " + b);
    }
}
