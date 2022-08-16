package day08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_split {
    public static void main(String[] args) {
        /*
 TASK :
 Kullanicidan alacaginiz 3 kelimeden olusan ismi
 orn: Ahmet Emin Yilmaz-->>A.E.Y seklinde yazdirin.
*/

        Scanner scan=new Scanner(System.in);
        System.out.println(" bir isim giriniz");
        String isim=scan.nextLine();
        //bu ismi oluşturdugum bir arrayın içine koyacagım.

        String [] Yisim=new String [isim.length()]; //uzunlugu 3 olan bir array oluşturdum.
        Yisim= isim.split(" "); //SPLİT ile aldıgım ismi boşluklarından ayırıp Yisim arrayıne ekledım.
        System.out.println(Arrays.toString(Yisim));
         String ilkHarf=Yisim[0].substring(0,1).concat(".");
         String ikinciHarf=Yisim[1].substring(0,1).concat(".");
         String ucuncuHarf=Yisim[2].substring(0,1).concat(".");
        System.out.println(ilkHarf+ikinciHarf+ucuncuHarf);

    }
}
