package ReplitArray;

import java.util.Arrays;

public class array10 {
    public static void main(String[] args) {
       /* Bir String değişkeni cümlesi verildiğinde,
          her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.*/

        String cml = "Java is fun";
        String [] str=cml.split(" ");
        System.out.println(Arrays.toString(str)); //[Java, is, fun]

     String ters="";
        for (int i = str.length-1; i >= 0; i--) {
            ters+=str[i]+" ";

        }
        System.out.println("**"+ters+"**");

    }
}