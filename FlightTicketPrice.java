package java101_projects;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class FlightTicketPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float factor = 0.10F;
        double km, result, totalPrice;
        int age, type;

        System.out.print("Gidilecek mesafe(Km cinsinden): ");
        km = scanner.nextDouble();
        System.out.print("Yaşınız: ");
        age = scanner.nextInt();
        System.out.print("Yolculuk tipi(1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = scanner.nextInt();
        if (km <= 0 || age < 0 || type < 1 || type > 2) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        factor = (type == 2) ? factor * 2 : factor;
        result = km * factor;
        if (age < 12) result = result /2;
        else if (age >= 12 && age <= 24) result = result * 0.90;
        else if (age > 65) result = result * 0.70;
        totalPrice = (type == 2) ? result * 0.80 : result;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##", symbols);
        System.out.println("Toplam tutar: " + decimalFormat.format(totalPrice) + "₺");
    }

}
