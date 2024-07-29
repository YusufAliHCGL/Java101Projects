package java101_projects;

import java.util.Scanner;

public class PowControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hedef sayıyı giriniz: ");
        int a = scanner.nextInt();
        for (int i = 0, j = 1, k = 1; j <= a || k <= a ; i++, j *= 4, k *= 5) {
            System.out.println("4^ " + i + " = " + j);
            System.out.println("5^ " + i + " = " + k);
        }
    }
}
