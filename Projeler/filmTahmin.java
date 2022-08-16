package Projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



    public class filmTahmin {

        static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */


        public static void main(String[] args) {
            System.out.println("Film Listesi: "  + film);
            filmiTahminEt(film);

        }

        private static void filmiTahminEt(List<String> film) {
            boolean filmTahmini = false;

            Scanner scan = new Scanner(System.in);
            System.out.println("Tahmin edeceginiz filmin index numarasını giriniz.");
            int index = scan.nextInt();
            int filminHarfSayisi = film.get(index).length();
            System.out.println("Sectiğiniz filmin karakter sayisi: " + filminHarfSayisi);
            int tahminHakki = (film.get(index).length()) * 2;
            System.out.println("Sectiğiniz film için tahmin hakkınız: " + tahminHakki);

            do {
                int tahminSayisi=0;

                System.out.println("Filmin ismini tahmin ediniz");
                String filmIsmi = scan.nextLine().toUpperCase();
                scan.nextLine();

                if (filmIsmi.equals(film.get(index))) {
                    System.out.println("Dogru bildiniz.Filmin adı: " + film.get(index));

                    filmTahmini=true;
                }
                else{
                    tahminHakki--;
                    System.out.println("Bilemediniz, kalan tahmin hakkınız: "+ tahminHakki);
                }
                if(tahminHakki==0){
                    System.out.println("Tahmin hakkınız kalmadı.Filmin adı: " + film.get(index));
                }



            }while (!filmTahmini) ;
        }
    }


