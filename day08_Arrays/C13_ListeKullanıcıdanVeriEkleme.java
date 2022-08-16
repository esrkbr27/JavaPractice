package day08_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C13_ListeKullanıcıdanVeriEkleme {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        List<String> list = new ArrayList<String>(5);
        String isim="";
        for (int i = 0; i < 5; i++) {
            System.out.println("isim giriniz");
            isim= scan.nextLine().toLowerCase();
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            list.add(isim);

        }
        Collections.sort(list);
        System.out.println(list);
    }

}
