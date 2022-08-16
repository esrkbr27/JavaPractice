package day02_Ternary;

import java.util.Scanner;

public class C06_KullanıcıSıfre {
    public static void main(String[] args) {
         /*
        Kullanicidan kullanici adini ve parolasini girmesini isteyin
        Kullanici adi ve şifreyi (koşul olarak if içerisinde siz belirleyin)
        Eger kullanıcı adı ve şifre uyumlu ise ekrana "Girisiniz Yapıldı" yazdırın
        Diger durumda "Hatali giris yaptiniz!
                      Sifrenizi sifirlamak isterseniz 'evet' istemezseniz 'hayır' yazın  " mesajını verin
        Kullanici 'hayir' derse ekrana (cevap.equals("evet")) yazdirin
        Kullanici 'evet' derse ekrana "Sifreniz eski sifreniz ile ayni olmamali!
                                       Yeni sifrenizi Giriniz :" yazdirin
        Farkli bir yanit girdiginde ekrana "Hatali secim yaptınız!" yazdirin
        Kullanicinin olusturdugu yeni sifre eski sifresiyle ayni olursa konsola
        "Sifreniz eski sifreniz ile ayni olamaz !" yazdirin
        Diger durumda ekrana "Yeni sifreniz basariyla olusturuldu !" yazdirin
         */

        //kullanıcı adı: Kubra
        //ilksıfre: Kubra27;

        String kullanıcıAdı, sıfre,cevap;
        String ilksıfre="Kubra27";

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen kullanıcı adı giriniz");
        kullanıcıAdı = scan.nextLine();

        System.out.println("lütfen sıfreyi giriniz");
        sıfre = scan.nextLine();

        if (kullanıcıAdı.equals("Kubra") && sıfre.equals("Kubra27")) {
            System.out.println("Giris yaptınız");
        }else{
            System.out.println("Hatalı giris yaptınız \n sıfrenizi sıfırlamak ister misiniz");
            cevap=scan.next().toLowerCase();
            if(cevap.equals("evet")) {
                System.out.println("sıfrenız eski sifreniz ile aynı olmamali\nyenı sıfrenizi giriniz :");

                String yenısıfre = scan.next();

                if (yenısıfre.equals("Kubra27")) {
                    System.out.println("sıfrenız eski sifreniz ile aynı olamaz!");

                } else {
                    System.out.println("sıfrenız basarılı bir sekilde olusturuldu.");
                }

            }
            else{
                         System.out.println("girisiniz sonlandırıldı");
                 }

            }

        }


    }

