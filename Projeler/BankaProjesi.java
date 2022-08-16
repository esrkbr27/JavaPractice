package Projeler;

import java.util.Scanner;

public class BankaProjesi {
    /*
Kullanicidan giris icin kart numarasi ve sifresini isteyin, eger birini yanlis girerse tekrar isteyin
Kart numarasi aralarda bosluk ile girerse ve eger dogruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilecegi islemleri ekrana yazdirin

Bakiye sorgula,para yatirma,para cekme,para gonderme,sifre degistirme ve cikis

Para cekme ve para gonderme islemine mevcut bakiyeden buyuk para cekilemez.
Para gonderme iselminde iban TR ile baslamali ve toplam 26 karakteri olmali, eger degilse menu ekranina geri donun
Sifre degistirme isleminde mevcut sifreyi teyit ettikten sonra, sifre degisiklik islemini yapmali.

*/
    public static void main(String[] args) {


        boolean sifreDogrumu = false;

        String gercekkartno = "1234 5678 3456";
        String gercekSifre = "EsraKübra 234!";
        double bakiye = 250;
        int hataligiris = 0;

        Scanner scan = new Scanner(System.in);

        while (!sifreDogrumu) {

            System.out.println("Kart numarasını giriniz");//1234 5678 3456
            String kartNo = scan.nextLine();
            scan.nextLine();
            System.out.println("Sıfrenizi giriniz");
            String sifre = scan.next();


            if (!sifre.equals(gercekSifre) || !(kartNo.equals(gercekkartno))) {
                if (!kartNo.contains(" ")) {
                    System.out.println("Hatalı giriş yaptınız,tekrar deneyin");
                    hataligiris++;

                } else {
                    System.out.println("Sisteme basarıyla giriş yapılmıştır.");

                    sifreDogrumu = true;
                }


            }

            if (hataligiris == 3) { //eklenebilir.
                System.out.println("3 defa hatali giris yaptınız,sifrenizi değiştiriniz");
            }

            System.out.println("Bakiye sorgula,para yatirma,para cekme,para gonderme,sifre degistirme,cıkıs" +
                    "\nislemlerden birini seciniz ");

            String secim = scan.next();
            if (secim.equals("Bakiye sorgula")) {
                System.out.println("Bakiyeniz: " + bakiye);
            } else if (secim.equals("para yatirma")) {
                bakiye++;
            } else if (secim.equals("para gonderme")) {
                System.out.println("Para gondereceginiz hesabın IBAN numarasını giriniz");
                String iban = scan.nextLine();
                System.out.println("Göndereceğiniz para miktarını giriniz");
                double gönderilecekpara = scan.nextDouble();
                if (!iban.startsWith("TR") && !(iban.length() == 26)) {
                    System.out.println("Lütfen tekrar IBAN numarasını giriniz");
                }
                if (gönderilecekpara > bakiye) {
                    System.out.println("Hesabınızda yeterli bakiye yoktur,lütfen gecerli bir miktar giriniz");
                } else {
                    double kalanPara = (bakiye - gönderilecekpara);
                    System.out.println("Gönderme isleminiz basarıyla gercekleşmiştir." + "kalan bakiyeniz: " + kalanPara);

                }

            } else if (secim.equals("Sifre degiştirme")) {
                System.out.println("Lütfen mevcut sifrenizi giriniz");
                String teyitsifre = scan.nextLine();
                if (teyitsifre.equals(gercekSifre)) {
                    System.out.println("Lütfen yeni sifrenizi giriniz");
                } else {
                    System.out.println("Mevcut sifrenizi yanlış girdiniz,lütfen tekrar deneyin");
                }

            } else if (secim.equals("Para cekme")) {
                System.out.println("Lütfen cekecegınız miktarı giriniz");
                double cekilecekpara = scan.nextDouble();
                if (cekilecekpara > bakiye) {
                    System.out.println("Bakiyenizde yeterli miktar para yoktur,+\n Lütfen gecerli bakiye giriniz");
                }

            }


        }


    }

}
