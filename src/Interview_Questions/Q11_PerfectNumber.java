package Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11_PerfectNumber {
    /* Task->
    Perfect Number (Mukemmel sayi)
      Girilen bir sayinın mukemmel olmasını kontrol eden method create ediniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int bolenlerToplam=0;

        for (int bolen = 1; bolen < sayi; bolen++) {
            if(sayi%bolen==0) {
                bolenlerToplam += bolen;
                System.out.print(bolen + " ");
            }
        }
        System.out.println();
        if(bolenlerToplam==sayi)
            System.out.println("Perfect Number");
        else
            System.out.println("Perfect Number değil");


    }//main sonu


}//Class sonu