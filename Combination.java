import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        String[] list;
        int n,r;
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while(isContinue) {
            System.out.println("Hesaplanması istenilen kombinasyon değerini giriniz(7,3 formatında): ");
            list = scanner.nextLine().split(",");
            n = Integer.parseInt(list[0]);
            r = Integer.parseInt(list[1]);
            combination(n,r);
            System.out.println("Devam etmek için 1 bitirmek için 0");
            isContinue = (scanner.nextLine().equals("1"));
        }
    }
    public static void combination(int n, int r) {
        if (r >= 0 && n >= r) {
            int combination = (factorial(n))/(factorial(n-r)*factorial(r));
            System.out.println(combination);
        } else {
            System.out.println("Sınırlara uygun sayı girilmelidir");
        }
    }
    public static int factorial(int i) {
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return factorial;
    }
}
