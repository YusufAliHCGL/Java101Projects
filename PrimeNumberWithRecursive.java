import java.util.Scanner;

public class PrimeNumberWithRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while(true) {
            System.out.print("Sayı giriniz: ");
            number = scanner.nextInt();
            if (number <= 1)
                System.out.println(number + " bir asal sayı değildir.");
            else if (isPrime(number, number/2))
                System.out.println(number + " bir asal sayıdır.");
            else
                System.out.println(number + " bir asal sayı değildir.");
        }
    }
    public static boolean isPrime(int number, int a) {
        if (a == 1)
            return true;
        if (number % a == 0)
            return false;
        else
            return isPrime(number,a - 1);
    }
}
