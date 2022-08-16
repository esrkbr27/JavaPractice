package ReplitİfSwitchTernary;

public class C09_İfSwıtch8 {
    public static void main(String[] args) {
     /*   Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

                INPUT : Mustafa

        OUTPUT : fafafa*/

        String isim="Mustafa";
        isim=isim.substring(isim.length()-2);
        System.out.println(isim.concat(isim).concat(isim));
    }
}
