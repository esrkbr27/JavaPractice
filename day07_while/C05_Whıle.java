package day07_while;

public class C05_Whıle {
    public static void main(String[] args) {

        //kullanıcıdan bas ve bitis karakterlerini alıp arasındakılerı buyuk harf olarak yazdırın.
        char inputbas='s';
        char inputson='z';

        String buyult="";

        char temp=inputbas; //ekrana bas.degerını yazdıracagım için kaybetmeme adına baska varıablea atadık.

        while(temp<=inputson){

            buyult=(temp+"").toUpperCase();
            /*

          char non prımıtıve oldugu için uppercase metodu yoktur.
          char ifadeyi String yaparak metodlardan yararlanabilirim.bunun için char ifadenın yanına
          bos bir string ifadeyı eklersem string guclü oldugu için char da strıng olur.
            */
            temp+=1;

            System.out.print(buyult+" ");
        }
    }
}
