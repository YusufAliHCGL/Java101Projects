package java101_projects;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ClassPassState {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double math, physic, chemistry, turkish, music;
        String state;

        System.out.print("Matematik Notunuz:");
        math = scanner.nextDouble();
        System.out.print("Fizik Notunuz:");
        physic = scanner.nextDouble();
        System.out.print("Kimya Notunuz:");
        chemistry = scanner.nextDouble();
        System.out.print("Türkçe Notunuz:");
        turkish = scanner.nextDouble();
        System.out.print("Müzik Notunuz:");
        music = scanner.nextDouble();

        double average = (math + physic + chemistry + turkish + music) / 5;

        state = (average >= 55) ?  "Sınıfı Geçti: " : "Sınıfta Kaldı: ";
        System.out.println(state + average);

    }


}
