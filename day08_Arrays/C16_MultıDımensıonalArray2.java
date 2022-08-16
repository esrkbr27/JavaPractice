package day08_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C16_MultıDımensıonalArray2 {
    public static void main(String[] args) {
        /*
iki adet MDA dizide bulunan elemanların ( küme elemanı gibi düşünün )
kesişim kümesini ve birleşim kümesini ayrı ayrı yazdıran JAVA kodu yazınız.
input : String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
output:  Dizilerin Kesişim Kümesi : 2c
         Dizilerin Birleşim Kümesi : a2c75kr1e8
 */

        String[][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String[][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
          List<String>list = new ArrayList<String>();
        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1[i].length; j++) {
                  list.add(dizi1[i][j]);

            }

        }
        System.out.println(list);//[a, 2, c, 7, 5, k, 7, r]


        List<String> list2 = new ArrayList<String>();
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                list2.add(dizi2[i][j]);

            }

        }
        System.out.println(list2);//[1, e, 2, e, c, 8, 1]

        Collections.sort(list);//[2, 5, 7, 7, a, c, k, r]
        Collections.sort(list2);//[1, 1, 2, 8, c, e, e]

        System.out.println(list);
        System.out.println(list2);

String kesısım="";

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list.get(i).equals(list2.get(j))) {
                    kesısım = list2.get(j);
                    if(!kesısım.contains(list.get(0))) {
                        kesısım+=list.get(0);
                    }
                }

            }

        }

        System.out.println(kesısım);//c2

        String birlesım="";

        for (int i = 0; i < list.size(); i++) {
              birlesım += list.get(i);
        }

        for (int i = 0; i < list2.size(); i++) {
            birlesım += list2.get(i);

        }
        System.out.println(birlesım);//2577ackr1128cee
        String tekrarsız="";
        tekrarsız+=birlesım.substring(0,1);
        for (int i = 1; i <birlesım.length() ; i++) {
            if(!tekrarsız.contains(birlesım.substring(i,i+1))){
                tekrarsız+=birlesım.substring(i,i+1);
            }
            
        }
        System.out.println(tekrarsız); //257ackr18e

        System.out.println("------2.yol--------");


        String kesisimKumesi="";
        String birlesimKumesi="";
        for (int i = 0; i <dizi1.length ; i++) {
            for (int j = 0; j <dizi1[i].length; j++) {
                for (int k = 0; k <dizi2.length ; k++) {
                    for (int l = 0; l <dizi2[k].length ; l++) {
                        if(dizi1[i][j].equals(dizi2[k][l])){
                            kesisimKumesi+=dizi1[i][j];
                        }else if(!birlesimKumesi.contains(dizi1[i][j]) && !birlesimKumesi.contains(dizi2[k][l])){
                            birlesimKumesi+=dizi1[i][j];
                        }
                    }
                }
            }
        }
        System.out.println("Birlesim kumesi : "+ birlesimKumesi);
        System.out.println("Kesisim kumesi : "+ kesisimKumesi);


        System.out.println("-------------3.yol--------------");


        String kesisim="";
        String  birlesim="";
        for (String [] w: dizi1 ) {
            for (String w1: w) {
                for (String [] q : dizi2) {
                    for (String q1: q) {
                        if (w1.equals(q1)) {
                            kesisim+=w1;
                        }
                    }
                }
            }
        }
        System.out.println("Dizilerin kesisim kumesi : "+kesisim);
        for (String [] w: dizi1 ) {
            for (String w1: w) {
                for (String [] q : dizi2) {
                    for (String q1: q) {
                        if (!birlesim.contains(w1)) {
                            birlesim+=w1;
                        }
                        if (!birlesim.contains(q1)) {
                            birlesim+=q1;
                        }
                    }
                }
            }
        }
        System.out.println("Dizilerin birlesim kumesi : "+birlesim);




    }
}