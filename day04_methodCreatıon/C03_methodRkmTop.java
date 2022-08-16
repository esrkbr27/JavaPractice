package day04_methodCreatıon;

public class C03_methodRkmTop {
    public static void main(String[] args) {
        //girilen 3 basamaklı sayının toplamını yazdıran method oluşturalım
        int sayi=345;
        rakamlarToplamı(sayi);



    }

    public static void rakamlarToplamı(int sayi ) {

        int rakamlarToplamı =0;
        int birlerBasamagı=0;
        int girilenSayı=sayi;

        birlerBasamagı=sayi%10; //birler basamagı 5
        rakamlarToplamı+=birlerBasamagı;//0+5=5
        sayi/=10; //sayi=345/10=34
        birlerBasamagı=sayi%10; //onlar basamagı 4   34%10=4
        rakamlarToplamı+=birlerBasamagı; // 5+4=9 oldu
        sayi/=10; //34/10=3
        birlerBasamagı=sayi%10; // yuzler basamagı= 3  3%10=3
        rakamlarToplamı+=birlerBasamagı; //9+3=12
        sayi/=10; // sayi=0 oldu 3/10=0

        System.out.println(girilenSayı +" sayısının rakamları toplamı: " + rakamlarToplamı);

    }
}
