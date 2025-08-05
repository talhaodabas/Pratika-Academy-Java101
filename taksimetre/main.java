package taksimetre;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        double km,total,perKm = 2.20;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yapılan km'yi girin.");
        km = inp.nextDouble();
        total = (km*perKm)+10;
        if (total<=20){
            System.out.println("Ödenecek tutar 20TL.");
        } else {
            System.out.println("Ödenecek tutar "+total+"TL.");
        }
    }
}
