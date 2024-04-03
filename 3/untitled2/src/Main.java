import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Вводим число");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int step = 1;
        while (step <= n) {

            System.out.println(step);
            step = step + 3; }

    }
}