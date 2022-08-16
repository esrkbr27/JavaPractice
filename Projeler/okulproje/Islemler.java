package Projeler.okulproje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



    public class Islemler {

        static List<Kisi> ogretmenList = new ArrayList<>();//bilgileri liste atacagız.
        static List<Kisi> ogrenciList = new ArrayList<>();//bilgileri liste atacagız.
        //Kisi classındakı tum variabalları kullanacagımız için data type olarak "Kisi" yaptık..
        //tüm metotlardan cagırmak için listi static yaptık.
        static Scanner scan = new Scanner(System.in);
        //tüm metotlardan  cagırmak için static olarak buraya yazdık
        static String kisiTürü;


        public static void girisPaneli() {
            System.out.println("====================================");
            System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
            System.out.println("====================================");
            System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
            System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
            System.out.println("0- ÇIKIŞ");

            System.out.println("Lütfen bir secim yapınız.");
            String secim = scan.nextLine().toUpperCase();
            switch (secim) {
                case "1":

                    kisiTürü = "OGRENCİ";
                    islemMenusu();
                    break;

                case "2":

                    kisiTürü = "OGREMEN";
                    islemMenusu();
                    break;

                case "0":

                    break;

                default:
                    System.out.println("Hatalı Giriş yaptınız.");
                    girisPaneli();

            }


        }

        public static void islemMenusu() {

            System.out.println("Sectiğin kişi türü" + kisiTürü + "asagıdaki işlemleri seciniz.");
            System.out.println("============= İŞLEMLER =============\n" +
                    "         1-EKLEME\n" +
                    "         2-ARAMA\n" +
                    "         3-LİSTELEME\n" +
                    "         4-SİLME\n" +
                    "         5-ANA MENÜ\n" +
                    "         0-ÇIKIŞ");

            System.out.println("İşlem tercihinizi giriniz.");
            int secilenIslem = scan.nextInt();
            switch (secilenIslem) {
                case 1:
                    ekle();
                    islemMenusu();
                    break;
                case 2:
                    //   arama();
                    islemMenusu();
                    break;
                case 3:
                    //   listeleme();
                    islemMenusu();
                    break;
                case 4:
                    //  silme();
                    islemMenusu();
                    break;
                case 5:
                    girisPaneli();
                    break;
                case 0:
                    //   cıkıs();
                    break;


                default:
                    System.out.println("dogru secim yapınız.");
                    islemMenusu();
                    break;


            }


        }

        public static void ekle() {//bu metot hem öğrenci hem de öğretmen eklemek için tasarlandı

            System.out.println("***"+kisiTürü+"ekleme sayfasina hosgeldiniz***");
            System.out.println("isim soyisim giriniz");
            String adSoyad=scan.nextLine();
            scan.nextLine();

            System.out.println("kimlik gir");
            String kimlikNo = scan.nextLine();

            System.out.println("yas gir");
            int yas = scan.nextInt();

            if(kisiTürü.equals("OGRENCİ")){//TO DO SONRA
                System.out.println("ogrenciNo giriniz");
                String ogrenciNo = scan.next();
                System.out.println("sinif giriniz");
                String sinif= scan.next();

                Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
                ogrenciList.add(ogrenci);
                System.out.println(ogrenciList);

            }
            else{
                System.out.println("bolum giriniz");
                String bolum = scan.nextLine();
                scan.nextLine();

                System.out.println("sicilNo giriniz");
                int sicilNo = scan.nextInt();

                OGretmen ogretmen = new OGretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
                ogretmenList.add(ogretmen);
                System.out.println(ogretmenList);

            }
        }

    }


