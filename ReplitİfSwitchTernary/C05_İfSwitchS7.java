package ReplitİfSwitchTernary;

import java.util.Scanner;

public class C05_İfSwitchS7 {
   /* Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

    Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

    Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

    Ternary kullanin.*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=scan.next().toLowerCase();
        int uzunluk=isim.length();
        String sonuc= uzunluk>3 ? "isim 3 karakterlı degıl" : isim.charAt(0)==isim.charAt(1) ||
                isim.charAt(2)==isim.charAt(0) || isim.charAt(1)==isim.charAt(2) ? "isim aynı karakterlere sahiptir":
                "Dizenin benzersiz karakterleri var";
        System.out.println(sonuc);

    }
}
