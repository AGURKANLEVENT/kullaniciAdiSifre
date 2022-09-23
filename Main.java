import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord, answer, newPassword;


        Scanner inp = new Scanner(System.in);


        System.out.println("Kullanici Adinizi Giriniz : ");
        userName = inp.nextLine();


        System.out.println("Lütfen Şifrenizi Giriniz : ");
        passWord = inp.nextLine();

        if (userName.equals("patika") && passWord.equals("java123")) {
            System.out.println("Girilen Bilgiler Doğru. Hoşgeldiniz.");
        } else if(userName.equals("patika")){

            System.out.print("Şifre hatalı!\nŞifreyi sıfırlamak ister misiz?(evet/hayır) : ");
            answer=inp.nextLine();

            if (answer.equals("evet")|| answer.equals("Evet")){

                System.out.print("Yeni Şifreniz : ");
                newPassword=inp.nextLine();

                if(newPassword.equals("java123")){

                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{

                    System.out.println("Şifre oluşturuldu");
                }

            }else{
                System.out.println("İşlem sonlandırıldı");
            }

        }else{
            System.out.println("Bütün Bilgiler Hatalı!");
        }
    }
    }
    
