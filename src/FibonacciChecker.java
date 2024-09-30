import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int a = 0, b = 1, c = 0;
        while (c < number) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
