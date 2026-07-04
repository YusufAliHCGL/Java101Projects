import java.util.Scanner;

public class ReverseTrianglePattern {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int rowNumber = scanner.nextInt();
       for (int i = rowNumber; i > 0; i--) {
           for (int j = 1; j <= i*2-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }

}
