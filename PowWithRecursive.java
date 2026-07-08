import java.util.Scanner;

public class PowWithRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b,e;
        while(true) {
            System.out.print("Taban değerini giriniz: ");
            b = scanner.nextInt();
            System.out.print("Üs değerini giriniz: ");
            e = scanner.nextInt();
            System.out.println("Sonuç: " + pow(b, e));
        }
    }
    public static int pow(int b, int e) {
        if (e == 0)
            return 1;
        else if (e == 1)
            return b;
        else
            return b * pow(b, e - 1);
    }
}
