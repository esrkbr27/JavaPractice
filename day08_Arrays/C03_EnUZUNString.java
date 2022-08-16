package day08_Arrays;

public class C03_EnUZUNString {
    public static void main(String[] args) {

        String[] cıcekler={"Karanfıl","lale","gul"};

        String enUzun=cıcekler[0];
        String enKısa=cıcekler[0];

        for (int i = 1; i < cıcekler.length ; i++) {
            if(cıcekler[i].length()>enUzun.length()) {
                cıcekler[i]=enUzun;
            }

        }
        System.out.println("enuzun : " + enUzun);


        for (int i = 1; i < cıcekler.length;  i++) {
            if(cıcekler[i].length()<enKısa.length()) {
                cıcekler[i]=enKısa;

            }

        }

    }
}
