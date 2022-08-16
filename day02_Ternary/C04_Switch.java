package day02_Ternary;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {
        /*
Basit Hesap Makinesi
Kullanicidan iki tamsayi alin
4 islemden hangisini yapmak istedigini sorun
verilen cevaba gore istenilen islemi yaptırın
eger hatalı islem secerse "Hatali Secim Yaptiniz" Yazdirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi girn");
        int sayi1=scan.nextInt();
        System.out.println("lütfen 2. bir tamsayi girn");
        int sayi2=scan.nextInt();
        System.out.println("lütfen hangi işlem yapmak istediginizi girn");
        String x= "toplama";
        x=scan.next().toLowerCase();

        switch (x) {
            case"toplama":
                System.out.println(sayi1+sayi2);
                break;
            case"cıkarma":
                System.out.println(sayi1-sayi2);
                break;
            case"carpma":
                System.out.println(sayi1*sayi2);
                break;
            case"bölme":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("hatalı giris yaptınız");

        }






    }
    }
