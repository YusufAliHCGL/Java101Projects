import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(digitSum(number));
    }
    public static int digitSum(int number) {
        int digitTotal = 0;
        while(number != 0) {
            digitTotal += number%10;
            number /= 10;
        }
        return digitTotal;
    }
}
