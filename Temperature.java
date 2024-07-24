package java101_projects;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz: ");
        double temperature = scanner.nextDouble();
        if (temperature < 5  ) System.out.println("Kayak Yapabilirsiniz");
        else if (temperature >= 5 && temperature < 15) System.out.println("Sinemaya Gidebilirsiniz");
        else if (temperature >= 15 && temperature <= 25) System.out.println("Piknik Yapabilirsiniz");
        else if (temperature > 25) System.out.println("Yüzmeye Gidebilirsiniz");
    }

}
