package day03_strıngManıpulatıon;

public class C04_replaceFirst {

    public static void main(String[] args) {

     String cml=  "Java ahJava. !.Seni ogrendigimiz GUN her sey# 123Cok KOLAY olacak    ";


     //replacefirst:Verilen ifadenın yalnızca ilk harfini değiştirir.
     //regex:normal ifade    replacement:yenisiyle degiştirme

        System.out.println(cml.replaceFirst("J","H"));


        String  str1= "$3.99";
        System.out.println(str1.replaceFirst("$","A")); //$3.99A
        System.out.println(str1.replaceFirst("$","")); //$3.99
        System.out.println(str1.replaceFirst("\\D","$"));//Exception


        String str2= "12345";
        System.out.println(str2.replaceFirst("1","6")); //62345
        System.out.println(str2.replaceFirst("1","!")); //!2345
        System.out.println(str2.replaceFirst("1",""));//2345











    }
}
