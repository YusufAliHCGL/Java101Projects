package java101_projects;

import java.util.Scanner;

public class NumberSorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        double firstNum = scanner.nextDouble();
        System.out.print("İkinc sayı: ");
        double secondNum = scanner.nextDouble();
        System.out.print("Üçüncü sayı: ");
        double thirdNum = scanner.nextDouble();
        System.out.print("Sıralama: ");
        if (firstNum > secondNum && firstNum > thirdNum) {
            if (secondNum > thirdNum) System.out.println(firstNum+" > "+secondNum+" > "+thirdNum);
            if (thirdNum > secondNum) System.out.println(firstNum+" > "+thirdNum+" > "+secondNum);
        }
        else if (secondNum> firstNum && secondNum > thirdNum) {
            if (firstNum > thirdNum) System.out.println(secondNum+" > "+firstNum+" > "+thirdNum);
            if (thirdNum > firstNum) System.out.println(secondNum+" > "+thirdNum+" > "+firstNum);
        }
        else if (thirdNum > secondNum && thirdNum > firstNum) {
            if (secondNum > firstNum) System.out.println(thirdNum+" > "+secondNum+" > "+firstNum);
            if (firstNum > secondNum) System.out.println(thirdNum+" > "+firstNum+" > "+secondNum);
        }
    }

}
