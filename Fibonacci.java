public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int number) {
        return (number == 0 || number == 1) ? 1 : (fibonacci(number-1) + fibonacci(number-2));
    }
}
