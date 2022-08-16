package day01;

import java.util.Scanner;

public class C02_İfElse {
    public static void main(String[] args) {

/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
Çin Zodyağı nedir?
4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve
sembollerle tanımlar.
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
ve yıldızlarla pek bir ilgisi yoktur.
Çin Zodyağı nasıl hesaplanır?
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
Senaryo
Doğum Yılınızı Giriniz : 1990
Çin Zodyağı Burcunuz : At
    }*/

        Scanner scan = new Scanner(System.in);

        int dogumyılı = scan.nextInt();
        System.out.println("lütfen dogum yılınızı giriniz");

        if (dogumyılı <= 0 && dogumyılı <= 10 && dogumyılı <= 100 && dogumyılı <= 100) {
            System.out.println("lütfen gecerli bir yıl giriniz");

        } else if (dogumyılı % 12 == 0) {
            System.out.println("maymun");

        } else if (dogumyılı % 12 == 1) {
            System.out.println("horoz");

        } else if (dogumyılı % 12 == 2) {

        } else if (dogumyılı % 12 == 3) {

        }
    }
}

