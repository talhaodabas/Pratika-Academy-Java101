package daireHesaplama;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        int r,a;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yarı çapı girin.");
        r = inp.nextInt();
        System.out.println("Alnını öğrenmek istediğiniz merkez açısının ölçüsü.");
        a = inp.nextInt();
        double formul = (pi * (r*r) * a) / 360;
        double alan = pi*r*r;
        double cevre = 2*pi*r;
        System.out.println("Merkez açı ölçüsü "+a+" olan daire diliminin alanı : "+formul);
        System.out.println("Alanı : "+alan+"\nÇevre : "+cevre);
    }
}
