package day08_Arrays;

import java.util.Scanner;

public class C04_Contaıns {
    public static void main(String[] args) {

        /*Soru 3- Kullanıcıdan aldıgınız bir ismin verilen bir array’de olup olmadıgını  kontrol edip,
         bize true veya false sonucu donen bir method olusturun.
         */

        String[] deger={"Ali","Ayse","Ahmet","Zeynep"};
        Scanner scan=new Scanner(System.in);
        System.out.println("aradıgınız ismı girin");
        String arananİsim=scan.next();

       boolean sonuc=contains(deger,arananİsim);
       if(sonuc){
           System.out.println("aradıgınız isim var");
       }else{
           System.out.println("aradıgınız isim yok");
       }

    }

    public static boolean contains(String[] deger, String arananİsim) {
        boolean sonuc2=true;


        for (int i = 0; i < deger.length ; i++) {
            if (deger[i].equalsIgnoreCase(arananİsim)){
                sonuc2 = true;

            }

        }




        return sonuc2;
    }


}
