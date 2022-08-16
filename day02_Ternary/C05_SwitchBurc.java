package day02_Ternary;

import java.util.Scanner;

public class C05_SwitchBurc {
    public static void main(String[] args) {
        /*
Burc bulan program yaziniz.

Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen dogdugunuz ayı giriniz");
        String day = scan.next().toLowerCase();


        System.out.println("lütfen dogdugunuz günü giriniz");
        int dtrh = scan.nextInt();

        switch (day) {
            case "day":
                    if (dtrh>=1 && dtrh<=30) {
                        if (dtrh<=22){
                            System.out.println("oglak");
                        }else {
                            System.out.println("kova");
                        }
                    }else{
                        System.out.println("lütfen gecerli bir tarih giriniz");
                    }
            case "day1":
        }



        }
    }