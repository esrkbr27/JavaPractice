package ReplitArray;

public class array11 {
    public static void main(String[] args) {


/*    Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.

        Test Data:
        birinci binary number: 100010
        ikinci  binary number: 110010
        Beklenen Çıktı:
        1010100
                */
        int binary1=100010;
        int binary2=110010;
        /*
        Birinci Yontem:
        Oncelikle binary1 ve binary2 sayisini ayri ayri onluk sisteme cevirip
        toplami ikilik sisteme cevirecegiz
         */
        int basamaklar=0;
        int carpim=1;
        int temp=binary1;
        int sayi1=0;
        //100010 sayisini onluk sisteme cevirmek demek;
        // birler basamagini 0 ile
        // ikinci basamagini 2 ile
        // ucuncu basamagini 2*2 ile
        //dorduncu basamagini 2*2*2 ile besinci basamagini 2*2*2*2 ile
        //altinci basamagi 2*2*2*2*2 ile carpip sonuclari toplayacagim
        //Sayimiz alti basamakli
        //birinci basamak=0*2=0
        //ikinci basamak=1*2=2
        //ucuncu basamak=0*2*2=0
        //dorduncu basamak=0*2*2*2=0
        //besinci basamak=0*2*2*2*2=0
        //altinci basamak=1*2*2*2*2*2=32
        //toplamlari 32+2=34
        while (temp!=0) {
            basamaklar=(temp%10)*carpim;
            sayi1+=basamaklar;
            carpim*=2;
            temp/=10;
        }
        System.out.println(binary1+" sayisinin onluk sistemde karsiligi "+sayi1);
        //110010 sayisini onluk sisteme cevirme
        //Sayimiz alti basamakli
        //birinci basamak=0*2=0
        //ikinci basamak=1*2=2
        //ucuncu basamak=0*2*2=0
        //dorduncu basamak=0*2*2*2=0
        //besinci basamak=1*2*2*2*2=16
        //altinci basamak=1*2*2*2*2*2=32
        //toplamlari 32+16+2=50;
        basamaklar=0;
        carpim=1;
        temp=binary2;
        int sayi2=0;
        while (temp!=0) {
            basamaklar=(temp%10)*carpim;
            sayi2+=basamaklar;
            carpim*=2;
            temp/=10;
        }
        System.out.println(binary2+" sayisinin onluk sistemde karsiligi "+sayi2);
        int yeniSayi=sayi1+sayi2;
        //yeni sayimiz 84 ikilik sisteme cevirmek icin surekli
        //ikiye bolecegiz ve kalani yenbinary sayimiza ekleyecegiz
        //84 : 2 --> kalan 0
        //42 : 2 --> kalan 0
        //21 : 2 --> kalan 1
        //10 : 2 --> kalan 0
        //5 : 2 ---> kalan 1
        //2 : 2 --> kalan 0
        //2 : 2 --> kalan olmadigi icin bolumu alacak bolum : 1
        basamaklar=0;
        carpim=1;
        temp=yeniSayi;
        int yeniBinary=0;
        while (temp!=0) {
            basamaklar=temp%2;
            yeniBinary+=basamaklar*carpim;
            carpim*=10;
            temp/=2;
        }
        System.out.println(yeniSayi+" sayisinin ikilik sistemde karsiligi "+ yeniBinary);
        //Ikinci yontem Wrapper Class kullanilarak bu sekilde yapilabiliyor

        int a=Integer.parseInt(String.valueOf(binary1), 2);
        int b=Integer.parseInt(String.valueOf(binary2),2);
        System.out.println(Integer.toBinaryString(a+b));
    }
}
