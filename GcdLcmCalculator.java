import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        int gcd,lcm;
        System.out.print("Sayı1: ");
        num1 = scanner.nextInt();
        System.out.print("Sayı2: ");
        num2 = scanner.nextInt();
        if (num1 > 0 && num2 > 0) {
            gcd = gcd(num1, num2);
            lcm = lcm(num1, num2);
            System.out.println(num1 + " ve " + num2 + " sayısının EBOB değeri: " + gcd);
            System.out.println(num1 + " ve " + num2 + " sayısının EKOK değeri: " + lcm);
        }
    }
    public static int gcd(int num1, int num2) {
        int mNum;
        int divisor = 1;
        if (num1 < num2)
            mNum = num1;
        else
            mNum = num2;
        int i = 1;
        while(i <= mNum) {
            if (num1%i == 0 && num2%i == 0)
                divisor = i;
            i++;
        }
        return divisor;
    }

    public static int lcm(int num1, int num2) {
        int mNum;
        int multiple = 1;
        if (num1 > num2)
            mNum = num1;
        else
            mNum = num2;
        int i = mNum;
        while(i <= (num1*num2)) {
            if (i%num1 == 0 && i%num2 == 0) {
                multiple = i;
                break;
            }
            i++;
        }
        return multiple;
    }
}
