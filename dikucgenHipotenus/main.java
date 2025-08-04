package dikucgenHipotenus;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Yukardaki üçgenin c kenarının uzunluğunu bulmak için sırayla a ve b kenarların uzunluklarını girin.");
        a = input.nextInt();
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("C = "+c);
    }
}
