package java101_projects;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hedef Sayıyı Giriniz: ");
        int input, sum = 0, counter = 0;
        input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }
        if (counter == 0) System.out.println("3 ve 4 e bölünen bir sayı bulunamadı");
        else System.out.println(sum/counter);
    }
}
