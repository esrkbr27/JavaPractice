package day09_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<Integer>();

        sayilar.add(1);
        sayilar.add(3);
        System.out.println(sayilar); //[1, 3]
        sayilar.add(0,6); //[6, 1, 3]
        System.out.println(sayilar);
    }


}
