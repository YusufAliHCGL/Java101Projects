import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double harmonicSeries = 0;
        for (int i = 1; i <= number; i++) {
            harmonicSeries += 1d /i;
        }
        System.out.println(harmonicSeries);
    }
}
