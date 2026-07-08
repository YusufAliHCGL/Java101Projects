import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı");
            int optionNumber = scanner.nextInt();
            switch (optionNumber) {
                case 1 -> addition();
                case 2 -> subtraction();
                case 3 -> multiplication();
                case 4 -> division();
                case 5 -> pow();
                case 6 -> factorial();
                case 7 -> modulo();
                case 8 -> rectangleAreAndPerimeter();
            }
        }
    }

    public static void addition() {
        int num1, num2;
        System.out.print("Toplama için ilk sayıyı giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("Toplama için ikinci sayıyı giriniz: ");
        num2 = scanner.nextInt();
        System.out.println("Toplama sonucu: " + (num1 + num2));
    }
    public static void subtraction() {
        int num1, num2;
        System.out.print("Çıkarma için ilk sayıyı giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("Çıkarma için ikinci sayıyı giriniz: ");
        num2 = scanner.nextInt();
        System.out.println("Çıkarma sonucu: " + (num1 - num2));
    }
    public static void multiplication() {
        int num1, num2;
        System.out.print("Çarpma için ilk sayıyı giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("Çarpma için ikinci sayıyı giriniz: ");
        num2 = scanner.nextInt();
        System.out.println("Çarpma sonucu: " + (num1 * num2));
    }
    public static void division() {
        int num1, num2;
        System.out.print("Bölünecek sayıyı giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        num2 = scanner.nextInt();
        System.out.println("Bölüm sonucu: " + ((double)num1 / num2));
    }
    public static void pow() {
        int num1, num2;
        System.out.print("Taban sayıyı giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        num2 = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        System.out.println(num1 + " üzeri " + num2 + ": " + result);
    }
    public static void factorial() {
        int num1;
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        num1 = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= num1; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel sonucu: " + result);
    }
    public static void modulo() {
        int num1, num2;
        System.out.print("Bölünecek sayıyı giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        num2 = scanner.nextInt();
        System.out.println("Kalan: " + (num1%num2));
    }
    public static void rectangleAreAndPerimeter() {
        int num1, num2;
        System.out.print("ilk kenar uzunluğunu giriniz: ");
        num1 = scanner.nextInt();
        System.out.print("İkinci kenar uzunluğu giriniz: ");
        num2 = scanner.nextInt();
        System.out.println("Dikdörtgenin alanı: " + (num1*num2) + " çevresi: " + ((num1+num2)*2));
    }
}
