package Math1;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        length = scanner.nextInt();
        int max = 0, min = 0;
        int temp;
        for (int i = 1; i <= length; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            temp = scanner.nextInt();
            if (i == 1) {
                max = temp;
                min = temp;
            }
            if (temp > max)
                max = temp;
            if (temp < min)
                min = temp;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
