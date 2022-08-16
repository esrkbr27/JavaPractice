package day06_nestedFor;

public class C06_ObebOkek {
    public static void main(String[] args) {
     /*  Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

        Input :

        30

        40*/
        int s1 = 10;
        int s2 = 2;
        int obeb = 0;
        int okek = 0;
        int sira = (s1 < s2 ? s1 : s2);
        for (int i = 1; i <= sira; i++) {
            if (s1 % i == 0 && s2 % i == 0) {
                obeb = i;
            }
        }
        System.out.println("obeb = " + obeb);
        System.out.println("okek = " + (s1 * s2) / obeb);

    }
}
