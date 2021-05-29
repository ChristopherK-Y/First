import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            for (String h : args) {
                System.out.printf("Hello %s", h);
            }
        }
    }
}
