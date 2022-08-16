package day08_Arrays;

public class C12_Boom {
    public static void main(String[] args) {
           /*
     "Integer sayılardan oluşan bir diziyi parametre olarak alan  ve dizide 7 rakamı  var ise
     "Boom!" ifadesini; aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
     Örnek çıktı:
     [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
     [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
     [2, 55, 60, 97, 86] ➞ "Boom!"
         */
    Integer[] arr={2, 55, 60, 97, 86};

    yediRakamınıBul(arr);

    }

    public static String yediRakamınıBul(Integer[] arr) { //String bir ifade dödürecek,yukardan diziyi parametre
        // olarak aldım

        String yedıRakamıVarMı="";
        /*
        dizideki rakamları tek tek inceleyecegım,
        1-->7 varsa,
        2-->birler basamagı 7 olan varsa
        3-->onlar basamgı 7 olan varsa boom yazacak
        degilse yok yazacak
         */
        int birlerbasamagı = 0;
        int onlarbasamgı = 0;


        for (int i = 0; i < arr.length; i++) {
            /*
           dizide tek basamak olan ve birler basamagını kontroletmek için
           %10 diyorum
           onlarbasamgını kontroletmek için arr[i] yi 10 a bölünce bölüm onlar basamagını
           kontrol etmemızı saglar.

             */

            /*
            Asagıda dizidekı tüm elmanların hem %10 hem de/10 yaptım
            buldugum sonucları asagıdakı ıfle kontrol ettım.
             */
           birlerbasamagı=arr[i]%10;
            System.out.println("birlerbasamagı = " + birlerbasamagı);
            onlarbasamgı=arr[i]/10;
            System.out.println("onlarbasamgı = " + onlarbasamgı);

            if(birlerbasamagı==7 || onlarbasamgı==7) {
                System.out.println("Boom!");
                break;
                //boom olunca döngünün durması için break yaptık
            }
            else {
                System.out.println("dizide 7 rakamı yok");
            }





        }




 return yedıRakamıVarMı;//String ifadeyi dödürecek,ama döngüden önce kızarmasın diye hiçlik atadım.
    }
}
