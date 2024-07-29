package java101_projects;

import java.util.Scanner;

public class SumControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;
        while (true) {
            System.out.print("Sayı Giriniz: ");
            num = scanner.nextInt();
            if (num % 2 == 1) break;
            else if(num % 4 == 0) sum += num;
        }
        System.out.println("Girilen sayılardan çift ve dördün katları olanların toplamı: " + sum);
    }
}
