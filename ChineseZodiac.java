package java101_projects;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int year = scanner.nextInt();
        String result = switch (year%12) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Kçpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> throw new IllegalStateException("Unexpected value: " + year%12);
        };
        System.out.println("Çin Zodyağı burcunuz: " + result);
    }
}
