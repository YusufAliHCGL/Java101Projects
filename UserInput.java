package java101_projects;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        String userName = "Yusuf";
        String userPassword = "password";
        Scanner scanner = new Scanner(System.in);
        String userNameInput, userPasswordInput;
        while(true) {
            System.out.print("Kullanıcı Adınız: ");
            userNameInput = scanner.next();
            System.out.print("Kullanıcı Şifreniz: ");
            userPasswordInput = scanner.next();
            if (userNameInput.equals(userName) && userPasswordInput.equals(userPassword)) {
                System.out.println("Başarıyla Giriş Yaptınız");
                break;
            } else {
                System.out.println("Girilen Bilgiler Yanlış!");
                System.out.print("Şifrenizi Sıfırlamak İçin 1 Tekrar Denemek İçin 2: ");
                if (scanner.nextInt() == 1) {
                    while (true) {
                        System.out.print("Yeni Şifre: ");
                        userNameInput = scanner.next();
                        if (userPassword.equals(userNameInput)) {
                            System.out.println("Başarısız İşlem");
                        } else {
                            userPassword = userNameInput;
                            System.out.println("Şifreniz Başarıyla Değiştirildi");
                            break;
                        }
                    }
                }
            }
        }
    }

}
