package day08_Arrays;

public class C02_MaxDegerBulma {
    public static void main(String[] args) {
        //verilen ınt arraydekı max sayıyı veren metod oluştur

        int [] sayilar={8,9,90};
        int maxdeger;

        maxDegerBulma(sayilar);
    }

    public static void maxDegerBulma(int[] sayilar) {

      int maxDeger;//ilk olarak 0 a atamadık,0 a atarsak bu yanlış degeri bize verebilir.(sayılar negatifse mesela)

        maxDeger=sayilar[0];// ilk indexe esitledik,diger degerlerle for döngüsü kullanarak karsılastıracagız

        for (int i = 1; i < sayilar.length; i++) { //0 indexi maxa esıtledıgımız için 1 den basladık

            if(sayilar[i]>maxDeger){
                maxDeger=sayilar[i];
            }

        }
        System.out.println("en buyuk sayı:"+ maxDeger);
    }
}
