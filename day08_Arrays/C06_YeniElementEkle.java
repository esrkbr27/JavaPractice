package day08_Arrays;

import java.util.Arrays;

public class C06_YeniElementEkle {
    public static void main(String[] args) {
        String [] lıste={"Ali","Ahmet","Ayse"};
        String eklenecekİsim="Esra";

        lıste=elemanekle(lıste,eklenecekİsim);

        System.out.println(Arrays.toString(lıste));
    }

    public static String[] elemanekle(String[] lıste, String eklenecekİsim) {
        //yeniliste oluşturuyoruz yukardakı listenın uzunlugundan 1 fazla olacak uzunlugu

        String [] yeniliste = new String [lıste.length+1];
        //eskı listedekı isimleri yenı listeye eklıyoruz

      //  yeniliste[0] = lıste[0];
     //   yeniliste[1] = lıste[1];
     //   yeniliste[2] = lıste[2];
        //yukardakı işlemı döngü ile yaparsak dinamik olur.

        for (int i = 0; i <lıste.length; i++) {
            yeniliste[i] =lıste[i];

        }//eskı isimler yenı listeye tasındı,eklenen ismi de son indexe yerlestırecegız

        yeniliste[yeniliste.length-1]=eklenecekİsim;



return yeniliste;
    }
}
