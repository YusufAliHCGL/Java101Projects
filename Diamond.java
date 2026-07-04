import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowNum = scanner.nextInt();
        for(int i = 1; i <= rowNum; i++) {
            for (int j = 1; j <= (rowNum - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i*2-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (rowNum-1); i >= 1; i--) {
            for (int j = 1; j <= (rowNum - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i*2-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
