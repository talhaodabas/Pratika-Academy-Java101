package dikucgenHipotenus;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        int a,b,c;
        double u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin alanını bulmak için sırayla düz kenarların uzunluklarını girin.");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u * (u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı : "+alan);
    }
}


