package day08_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_EnKücükSayı {
    // Tamsayilardan olusan bir array de  en kucuk pozitif elemanı ve
    // en buyuk negatif elemanı bulun
// Ornek: {-12,18,-5,23,-2} ==> En kucuk pozitif sayi= 18 , En buyuk negatif sayi=-2

    public static void main(String[] args) {
        int[] arr = {-12, 18, -5, 23, -2};
        List<Integer> list= new ArrayList<Integer>();
        List<Integer> pozitif = new ArrayList<Integer>();
        List<Integer> negatif = new ArrayList<Integer>();
        int enkucukpozıtıfsayı;
        int enbuyuknegatifsayı;


        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<0){
                negatif.add(list.get(i));
            }
            else{
                pozitif.add(list.get(i));
            }

        }
        System.out.println("negatif = " + negatif);//negatif = [-12, -5, -2]
        System.out.println("pozitif = " + pozitif);//pozitif = [18, 23]

Collections.sort(negatif);
Collections.sort(pozitif);

enbuyuknegatifsayı=negatif.get(negatif.size()-1);
enkucukpozıtıfsayı=pozitif.get(0);

        System.out.println("enbuyuknegatifsayı = " + enbuyuknegatifsayı);
        System.out.println("enkucukpozıtıfsayı = " + enkucukpozıtıfsayı);


        System.out.println("-------------------------------------------------");

        int[] arr1 = {-12, 18, -5, 23, -2};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); //[-12, -5, -2, 18, 23]

        int enkucukpozıtıfsayı1=arr1[arr1.length-1];
        int enbuyuknegatifsayı1=arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0 && arr1[i]<enkucukpozıtıfsayı1){
                enkucukpozıtıfsayı1=arr1[i];
            }
            else if(arr1[i]<0 && arr1[i]>enbuyuknegatifsayı1){
                enbuyuknegatifsayı1=arr1[i];

            }

        }
        System.out.println("enbuyuknegatifsayı1 = " + enbuyuknegatifsayı1);
        System.out.println("enkucukpozıtıfsayı1 = " + enkucukpozıtıfsayı1);






    }
}
