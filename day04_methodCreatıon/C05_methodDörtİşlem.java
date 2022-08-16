package day04_methodCreatıon;

import static day04_methodCreatıon.C01_methodCreatıon.topla;

public class C05_methodDörtİşlem {
    public static void main(String[] args) {

        int num1=45;
        int num2=67;
        Topla(num1,num2);
        int topla= Topla(num1,num2);
        System.out.println("sayıların toplamı: " + topla);
        Cıkar(num1,num2);
        double cıkar= Cıkar(num1,num2);
        System.out.println("sayıların farkı: "+ cıkar);
        Carp(num1,num2);
        double carpma=Carp(num1,num2);
        System.out.println("sayıların carpımı: "+ carpma);
        double bölme= Bölme(num1,num2);
        System.out.println("sayıların bölümü: "+ bölme);

        }

    public static double Bölme(int num1, int num2) {
        double bolme= (double) (num1/num2);
        return bolme;
    }

    public static int Carp(int num1, int num2) {
        int carpma=num1*num2;
        return carpma;
    }



    public static int Cıkar(int num1, int num2) {
        int cıkar=num1-num2;
        return cıkar;


    }

    public static int Topla(int num1, int num2) {
        int topla=num1 +num2;
        return topla;


    }
}
