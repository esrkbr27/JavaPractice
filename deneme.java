import com.sun.source.tree.Tree;

import java.util.*;

public class deneme {

    public static void main(String[] args) {
Map<Integer, String> map=new HashMap();
map.put(10,"Ali, Can, Matematik");
map.put(11,"Emre, Erdem, Fizik");


Collection<String> mapValue=map.values();
        System.out.println(mapValue);//map values//[Ali, Can, Matematik, Emre, Erdem, Fizik]
int sira=1;
        String [] arr;
        for (String each:mapValue) {
            arr=each.split(", ");
            System.out.println(sira+arr[0]+" "+arr[1]);
            sira++;
        }


        List<String> list = new ArrayList<String>();

        for (String each:mapValue) {
               arr=each.split(", ");
               list.add(arr[0]+" "+arr[1]);
        }
        System.out.println(list);//[Ali Can, Emre Erdem]


        Set <Integer> mapKey=map.keySet();
        System.out.println(mapKey);


        List<Integer> listkey = new ArrayList<Integer>();
        for (Integer each:mapKey) {
          listkey.add(each);

        }
        System.out.println(listkey);



        //




        Map<Integer,String> hastakayitmap = new TreeMap<Integer,String>();

        hastakayitmap.put(100,"Ayse, Erdem, BT");
        hastakayitmap.put(101,"Esra, Demirci, BT");
        hastakayitmap.put(102,"Yasemin, Sahin, MR");
        hastakayitmap.put(103,"Ali, Veli, MR");
        hastakayitmap.put(104,"Esma, Kılıc, MR");
        hastakayitmap.put(105,"Ahmet, Kaan, BT");

        System.out.println(hastakayitmap);

        Collection<String> hastakayitlist = hastakayitmap.values();

        String[] arr1;
        String islem;

        Map<String,Integer> islemSayisiMap = new HashMap<String,Integer>();
        for (String each : hastakayitlist){

            arr1=each.split(",");
            islem=arr1[2];
            System.out.println(islem);

            if(!islemSayisiMap.containsValue(islem)){
                islemSayisiMap.put(islem,1);
            }else{


            }
        }









    }
}



