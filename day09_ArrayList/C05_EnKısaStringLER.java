package day09_ArrayList;

public class C05_EnKısaStringLER {
    public static void main(String[] args) {
        /*
Bir String array de uzunlugu en kucuk olan elemani bulun
Ornek = {"Kemal","Jonathan","Mark", "Argie","Veli"}
Cıktı : Mark, Veli
 */
        String[] str={"Kemal","Jonathan","Mark", "Argie","Veli"};
        int enkucukkelimeuzunluk=str[0].length(); //en kucuk kelimenın uzunlugunu
        // döngü ile arayacagız.1. önce esitleyip digerleriyle karsılastırcacagız.
        String enkısakelime="";

        for (int i = 0; i < str.length; i++) {
            if (str[i].length()<enkucukkelimeuzunluk) {
                enkucukkelimeuzunluk= str[i].length();
            }

        }

        //en kısa karakterın uzunlugunu bulduktan sonra bu uzunlukta baska eleman var mı dıye kontrol edecgz

        for (int i = 0; i < str.length; i++) {
            if(str[i].length()==enkucukkelimeuzunluk) {
                enkısakelime+=str[i]+","; //strde en kucukkelimeuzunlukta olanları ekle

            }

        }
        System.out.println(enkısakelime);


    }
}
