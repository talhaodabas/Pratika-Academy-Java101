package manavKasa;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.0, kg, toplam;
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        kg = inp.nextDouble();
        toplam = kg*Armut;
        System.out.print("Elma Kaç Kilo ? :");
        kg = inp.nextDouble();
        toplam = kg*Elma+toplam;
        System.out.print("Domates Kaç Kilo ? :");
        kg = inp.nextDouble();
        toplam = kg*Domates+toplam;
        System.out.print("Muz Kaç Kilo ? :");
        kg = inp.nextDouble();
        toplam = kg*Muz+toplam;
        System.out.print("Patlıcan Kaç Kilo ? :");
        kg = inp.nextDouble();
        toplam = kg*Patlican+toplam;
        System.out.println("Toplam Tutar : "+toplam);

    }
}
