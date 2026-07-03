import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k,result;
        System.out.println("Üssü alınacak sayı: ");
        n = scanner.nextInt();
        System.out.println("Üs olacak sayı: ");
        k = scanner.nextInt();
        result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n;
        }
        System.out.println("Sonuç: " + result);
    }
}
