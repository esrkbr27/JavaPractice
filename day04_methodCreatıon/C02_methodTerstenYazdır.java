package day04_methodCreatıon;

public class C02_methodTerstenYazdır {
    public static void main(String[] args) {

        String isim="Rabia";

        terstenYazdır(isim);

        //Diğer classtakı metodu burda da kullanabilirim
        C01_methodCreatıon.topla(2,8);
    }

    public static void terstenYazdır(String isim) {

        String tersİsim=isim.substring(4)+isim.substring(3,4)+isim.substring(2,3)+
                isim.substring(1,2)+isim.substring(0,1);

        System.out.println(isim +" kelimesinin tersten yazılışı: "+ tersİsim);
    }

}
