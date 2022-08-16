package day02_Ternary;

import java.util.Locale;
import java.util.Scanner;

public class C08_UcakBileti {
    public static void main(String[] args) {

         /*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve
sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL

Senaryolar
Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
Toplam Tutar = 216 TL

Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
Hatalı Veri Girdiniz !

Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş -->1
Toplam Tutar = 20.0 TL
          */

        Scanner scan = new Scanner(System.in);
        int yas;
        int yolculukTipi;

        double Mesafe, İndirimliTutar, İndirimliTutar2, İndirimliTutar3, GidişDönüşBiletİndirimi1, GidişDönüşBiletİndirimi2, ToplamTutar;
        double ToplamTutar2, ToplamTutar3, GidişDönüşBiletİndirimi3, ToplamTutar4;

        System.out.println("lütfen yolculuk tipinizi giriniz");
        yolculukTipi = scan.nextInt();

        System.out.println("lütfen gidecegınız mesafeyı giriniz");
        Mesafe = scan.nextInt();

        System.out.println("lütfen yasınızı giriniz");
        yas = scan.nextInt();

        if (yolculukTipi == 1) {
            if (Mesafe > 1 && yas > 0) {
                double NormalTutar = Mesafe * 0.10;
                if (yas < 12) {
                    İndirimliTutar = NormalTutar - (NormalTutar * 0.50);
                    System.out.println("Biletinizin fiatı: " + İndirimliTutar);
                } else if (yas < 24) {
                    İndirimliTutar2 = NormalTutar - (NormalTutar * 0.10);
                    System.out.println("Biletinizin fiatı: " + İndirimliTutar2);
                } else if (yas < 65) {
                    System.out.println("Biletinizin fiatı: " + NormalTutar);
                } else {
                    İndirimliTutar3 = NormalTutar - (NormalTutar * 0.30);
                    System.out.println("Biletinizin fiatı: " + İndirimliTutar3);
                }
            } else {
                System.out.println("Hatalı Veri Girdiniz !");
            }

        } else if (yolculukTipi == 2) {
            if (Mesafe > 1 && yas > 0) {
                double NormalTutar = Mesafe * 0.10;
                if (yas < 12) {
                    İndirimliTutar = NormalTutar - (NormalTutar * 0.50);
                    GidişDönüşBiletİndirimi1 = İndirimliTutar * 0.20;
                    ToplamTutar = (İndirimliTutar - GidişDönüşBiletİndirimi1) * 2;
                    System.out.println("Biletinizin fiatı: " + ToplamTutar);
                } else if (yas < 24) {
                    İndirimliTutar2 = NormalTutar - (NormalTutar * 0.10);
                    GidişDönüşBiletİndirimi2 = İndirimliTutar2 * 0.20;
                    ToplamTutar2 = (İndirimliTutar2 - GidişDönüşBiletİndirimi2) * 2;
                    System.out.println("Biletinizin fiatı: " + ToplamTutar2);
                } else if (yas < 65) {
                    ToplamTutar3 = NormalTutar - (NormalTutar * 0.20);
                    System.out.println("Biletinizin fiatı: " + ToplamTutar3);
                }else{
                    İndirimliTutar3 = NormalTutar - (NormalTutar * 0.30);
                GidişDönüşBiletİndirimi3 = İndirimliTutar3 * 0.20;
                ToplamTutar4 = (İndirimliTutar3 - GidişDönüşBiletİndirimi3) * 2;
                System.out.println("Biletinizin fiatı: " + ToplamTutar4);
                }

                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }

            }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        }
    }
