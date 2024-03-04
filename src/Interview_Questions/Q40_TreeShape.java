package Interview_Questions;

import java.util.Scanner;

public class Q40_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ağacın tac uzunluğu kaç olsun");
        int tac= input.nextInt();
        for (int i = 0; i <tac; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        for (int j = 0; j <5 ; j++) {
            System.out.println("|||");
        }

    }
}



