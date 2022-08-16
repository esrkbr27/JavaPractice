package day09_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_RandomSayıListeEkle {
    public static void main(String[] args) {

  /*
        içinde 200 tane 1000 den küçük pozotıf tamsayı olan bir list oluşturun.
        kullanıcıdan bir sayı isteyip listede var olup olmadıgını kullanıcıya yazdırın.(Tahmin Oyunu)
         */

        //önce rastgele sayılardan oluşan bir listeyi javaya ürettiriyoruz.Bunun için
        // Random classını oluşturyoruz.

        /* Sorunun algoritması;

        1.Sayılar 1000 den küçük ve biribirinden farklı olcak.
        2..Bu sayıları random classı ile bilg oluşturacak biz döngü ile liste ekleyecegız.
        3..listın buyukulugu 200 olacak(integer bir list oluşturacagız.)
        4.oluşturşan bu sayılar liste eklenecek.
        5.Kullanıcıdan sayı alınıp listede var mı yok mu kontrol edecegız.
        6.sayıyı kaç kere de bulacagını bilmıyoruz, o yuzden while kullanacagız,whıle ın içinde kullanıcıya
        soru soracagız.

         */

        Random rnd=new Random();
        List<Integer> sayilistesi=new ArrayList<Integer>();
        int sayi=0; //sayı tanımladık.döngüden önce kac gelecegını bilmiyorum.


        while (sayilistesi.size()<=200){
            sayi= rnd.nextInt(1000);//1000 den küçük sayı üret.(ama aynı sayılar da olabilir.)

            if(!sayilistesi.contains(sayi)){ //sayilistesinde alınan sayıların aynı olmaması için if
                //koyduk.
                sayilistesi.add(sayi);   //sayiları döngü ile aldık, liste ekleyecegız
            }
            System.out.println(sayilistesi);

        }
        Scanner scan = new Scanner(System.in);
        boolean bildiMi=false;

        while (!bildiMi){
            System.out.println("lütfen bir sayı giriniz");
            sayi=scan.nextInt();

            if(sayilistesi.contains(sayi)){
                System.out.println("bildiniz");
                bildiMi=true;
            }else{
                System.out.println("giridiniz sayı yok");
            }
        }



    }
}
