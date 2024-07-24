package java101_projects;

import java.util.Scanner;

public class DateOfBirth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day, month;
        int dayInt, monthInt;
        System.out.print("Doğum Tarihiniz(01/01/2000 formatında): ");
        String[] list = scanner.nextLine().split("/");
        String regex = "^0";
        day = list[0].replaceFirst(regex, "");
        month = list[1].replaceFirst(regex, "");
        dayInt = Integer.parseInt(day);
        monthInt = Integer.parseInt(month);

        if (monthInt == 1) {
            if (dayInt > 0 && dayInt <= 21) System.out.println("Oğlak Burcu");
            else if (dayInt > 21) System.out.println("Kova Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 2) {
            if (dayInt > 0 && dayInt <= 19) System.out.println("Kova Burcu");
            else if (dayInt > 19) System.out.println("Balık Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 3) {
            if (dayInt > 0 && dayInt <= 20) System.out.println("Balık Burcu");
            else if (dayInt > 20) System.out.println("Koç Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 4) {
            if (dayInt > 0 && dayInt <= 20) System.out.println("Koç Burcu");
            else if (dayInt > 20) System.out.println("Boğa Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 5) {
            if (dayInt > 0 && dayInt <= 21) System.out.println("Boğa Burcu");
            else if (dayInt > 21) System.out.println("İkizler Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 6) {
            if (dayInt > 0 && dayInt <= 22) System.out.println("İkizler Burcu");
            else if (dayInt > 22) System.out.println("Yengeç Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 7) {
            if (dayInt > 0 && dayInt <= 22) System.out.println("Yengeç Burcu");
            else if (dayInt > 22) System.out.println("Aslan Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 8) {
            if (dayInt > 0 && dayInt <= 22) System.out.println("Aslan Burcu");
            else if (dayInt > 22) System.out.println("Başak Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 9) {
            if (dayInt > 0 && dayInt <= 22) System.out.println("Başak Burcu");
            else if (dayInt > 22) System.out.println("Terazi Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 10) {
            if (dayInt > 0 && dayInt <= 22) System.out.println("Terazi Burcu");
            else if (dayInt > 22) System.out.println("Akrep Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 11) {
            if (dayInt > 0 && dayInt <= 21) System.out.println("Akrep Burcu");
            else if (dayInt > 21) System.out.println("Yay Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }
        else if (monthInt == 12) {
            if (dayInt > 0 && dayInt <= 21) System.out.println("Yay Burcu");
            else if (dayInt > 21) System.out.println("Oğlak Burcu");
            else System.out.println("Geçersiz Tarih Girildi");
        }


    }

}
