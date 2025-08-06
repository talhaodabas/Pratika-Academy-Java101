package vucudKitleIndeksi;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        double kg,boy;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = inp.nextDouble();
        double indeks = kg/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+indeks);
    }
}
