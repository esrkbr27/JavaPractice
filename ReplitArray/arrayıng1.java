package ReplitArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayıng1 {
    public static void main(String[] args) {
      /*  Write a Java program to get a String from user as input
       and find the maximum occurring character in that string. (Ignore case sensitivity)

        input :

        Learning java is easy

        output:

        maximum occurring character is : */
        String str = " Learningjavaiseasy";
        String[] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        String yinelenenKarakter="";
        int counter=0;
    List<String> str1=new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
         str1.add(str.substring(i,i+1));

        }
        System.out.println(str1);
        Collections.sort(str1);
        System.out.println(str1);

        List<String> str2 = new ArrayList<String>();
    ;
        for (int i = 0; i < str1.size()-1; i++){
            if (str1.get(i).equals(str1.get(i + 1))){
                str2.add(str1.get(i));
            }
        }
        System.out.println(str2);

        for (int i = 0; i < str2.size(); i++) {
            String harf1=str2.get(i);
            for (int j = i+1; j < str2.size(); j++) {
                String harf2=str2.get(j);

                if(harf1.equals(harf2) && !yinelenenKarakter.contains(harf1)) {
                  yinelenenKarakter+=harf1;

                }

                }

        }
        System.out.println(yinelenenKarakter);


    }
}
