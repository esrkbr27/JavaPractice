package ReplıtForWhile;

public class S3_YinelenenKarakter {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s

         */

       // String str = "Javaisalsoeasy";
       // String yinelenenKarakter = "";

      //  for (int i = 0; i < str.length(); i++) {
           /*ASAGIDAKI FARKLI HARFLERI KOYMAK İÇİN..
           döngü ile tüm karakterleri bos strınge koyuyorum.
           koydugum bir öncek ile aynı değilse koy aynı ise koyma diyorum if ile
            */

         /*   if(!yinelenenKarakter.contains(str.substring(i, i+1))){
                yinelenenKarakter+=str.substring(i, i+1);
            }

        }
        System.out.println(yinelenenKarakter);*/


            //NOTTTT!!!!
            /*
            bir stringde indexof ve lastindexof AYNI DEGERİ DÖNDÜRÜYORSA SADECE 1 DEFA KULLANILMIŞ DEMEKTİR.
                          indexof ve lastindexof AYNI DEGERİ DÖNDÜRMÜYORSA O KARAKTER 1 DEN FAZLA
                          KULLANILMIŞ DEMEKTİR.

             */
        String str = "Javaisalsoeasy";
        String yinelenenKarakter = " ";

            for (int i = 0; i < str.length(); i++) {
                if(str.indexOf(str.substring(i, i+1))!=str.lastIndexOf(str.substring(i, i+1))){
                    if(!yinelenenKarakter.contains(str.substring(i, i+1))) {
                        yinelenenKarakter+=str.substring(i, i+1)+" ";


                    }


                }

            }
        System.out.println(yinelenenKarakter);

            }




    }

