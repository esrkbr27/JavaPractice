package day06_nestedFor;

public class C04_tekrarlananKarakter {

/*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

    public static void main(String[] args) {
        String str="Javaisalsoeasy";
        String bulunan="";
        for(int i=0; i<str.length(); i++) {
            String harf1=str.substring(i,i+1);
            System.out.print(harf1);
            for(int j=i+1; j<str.length(); j++) {
                String harf2=str.substring(j,j+1);

                bulunan=bulunan + " "+harf2;

                if(harf2.equals(harf1) && !bulunan.contains(harf2) ) {


                }

            }

        }
        System.out.println(bulunan);
    }

}

