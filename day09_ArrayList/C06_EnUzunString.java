package day09_ArrayList;

import java.util.*;

public class C06_EnUzunString {
    public static void main(String[] args) {
     /*   Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
        input : String sehirler[] = {"Trabzon","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
        output: [Çanakkale, Şanlıurfa, İstanbul, Trabzon, Sinop, Hatay, Ordu, Van]*/

        String[] sehirler= {"Trabzon","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};

    List<String> listSehir= new ArrayList<String>();
        for (int i = 0; i < sehirler.length; i++) {
            listSehir.add(sehirler[i]);
        }

        System.out.println(listSehir);

       int uzunKarakter=listSehir.get(0).length();

        List<String> listSiraliSehir= new ArrayList<String>();//sıralanack liste


        for (int i = 0; i < listSehir.size()-1; i++) {
            for (int j = 0; j < listSehir.size() ; j++) {
                if(listSehir.get(j).length()>uzunKarakter){
                    uzunKarakter = listSehir.get(j).length();
                }

                listSiraliSehir.add(listSehir.get(j));

            }

        }









    }
}
