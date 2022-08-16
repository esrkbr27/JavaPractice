package day03_strıngManıpulatıon;

public class C05_replace {
    public static void main(String[] args) {
        String cml=  "     Java ahJava. !.Seni ogrendigimiz GUN her sey# 123Cok KOLAY olacak    ";

        //istedıgımız karakteri tanımladıgımız yenı karakter ile degişir."" veya ' ' ile yazılabilir.

        String input=cml.replace('J','j');
        System.out.println(input);

        System.out.println(input.replace("J","H"));
        System.out.println(input.replace("ogrendigimiz","sevecegımız"));
        System.out.println(input.replace("ogrendigimiz", "sevdigimiz").replace("ahjava", "ah Java"));


    }
}
