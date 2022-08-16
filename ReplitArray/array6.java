package ReplitArray;

import java.util.ArrayList;
import java.util.List;

public class array6 {
    public static void main(String[] args) {
     //   Array i ARRAYLIST e çeviren Java Kodunu yazınız.

         String [] array={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

         List<String> list=new ArrayList<String>(array.length);
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);

        }
        System.out.println(list);
    }
}
