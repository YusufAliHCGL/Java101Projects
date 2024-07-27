package java101_projects;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int year = scanner.nextInt();
        String result = ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) ? "Artık Bir Yıldır" : "Artık Bir Yıl Değidir";
        System.out.println(year + " " + result);
    }
}
