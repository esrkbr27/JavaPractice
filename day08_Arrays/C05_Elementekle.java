package day08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Elementekle {
    public static void main(String[] args) {

        int[] sayi=arrayOlustur();
        System.out.println(Arrays.toString(sayi));

    }

    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("arrayın uzunlugunu gir");
        int uzunluk=scan.nextInt();

        int [] yenisayi=new int[uzunluk]; //array oluşturuyoruz.
        //uzunluk sayısı kadar kullanıcıdan deger alıp bu degerleri indexlere yerleştırıyoruz.
        //bunun için döngüden faydalanırız.

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i +" .cı index için element giriniz");
             yenisayi[i] = scan.nextInt();



        }





       return yenisayi;
    }
}
