package day04_methodCreatıon;

public class C01_methodCreatıon {
    public static void main(String[] args) {
        int sayi1=30;
        int sayi2=67;

        topla(sayi1, sayi2);  //methoda topla ismini verip argumentleri içine yazdık.
                              //üstüne gelip metod oluşturmasını istedik.
    }
    //Java otomatık oalarak aşagıdakı metodu olşturdu.
    //biz her yerde kulanmak için prıvate ı publiic yaptık.
    public static void topla(int sayi1, int sayi2) {

        //Toplama işemini bir varıble atadık
        int toplam=sayi1+sayi2;

        System.out.println("Girilen sayilarin toplamı: "+ toplam);
    }

}
