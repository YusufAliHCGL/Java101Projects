import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final String USER_NAME = "ASHINA";
        final String PASSWORD = "2019SP";
        String userName, password;
        int balance = 1500;
        int right = 3;
        int select = 4;
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        while(right > 0) {
            System.out.println("Deneme Hakkınız: " + right);
            System.out.print("Kullanıcı Adınız: ");
            userName = scanner.nextLine();
            System.out.print("Şifreniz: ");
            password = scanner.nextLine();
            if (userName.equals(USER_NAME) && password.equals(PASSWORD)) {
                isContinue = true;
                while (isContinue) {
                    System.out.println("1-> Para Yatır\n2-> Para Çek\n3-> Bakiye Sorgula\n4-> Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlem: ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmak İstediğiniz Para Miktarı: ");
                            int price = scanner.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Çekmek İstediğiniz Para Miktarı: ");
                            int price = scanner.nextInt();
                            balance -= price;
                        }
                        case 3 -> {
                            System.out.println("Bakiyeniz: " + balance);
                        }
                        case 4 -> {
                            System.out.println("Çıkış Yaptınız");
                            isContinue = false;
                        }
                        default -> {
                            System.out.println("Hatalı Değer Girdiniz");
                        }
                    }
                }
            } else {
                if (--right != 0)
                    System.out.println("Tekrar Deneyiniz.");
                else
                    System.out.println("Deneme Hakkınız Bitmiştir.");
            }
        }
    }
}
