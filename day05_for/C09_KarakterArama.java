package day05_for;

import java.util.Scanner;

public class C09_KarakterArama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimdeki döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin
         Örneğin:
           char ch1= 'a' ;
            String name="John geç geldi"
            Beklenen Çıktı: a sayısı = 2
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle girin");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("lütfen aradıgınız karakteri girin");
        char karakter=scan.next().toLowerCase().charAt(0);
        int sayac=0;

        for(int i=0; i<cumle.length(); i++){ //döngü index numaralarında dönüyor.
            // Stringlerde i yi index numarasına eşitliyoruz.0. indexden başlıyoruz karakterleri tek tek incelemeye
            // cümlenın uzunlıgu kadar tarıyoruz.aldıgımız karaktere eşitse sayacı 1 artırıyoruz.

            if(cumle.charAt(i)==karakter){
                sayac++;
            }
        }
        System.out.println(karakter+ " den "+sayac+" tane var.");
    }
}
