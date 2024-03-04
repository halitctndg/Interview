package Interview_Questions;

import java.util.Scanner;


public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    public static void main(String[] args) {
        tekCift();
    }//main sonu

    private static void tekCift() {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi= input.nextInt();
        if(sayi%2==0)
            System.out.println("ÇİFT SAYIDIR.");
        else
            System.out.println("ÇİFT SAYI DEĞİLDİR.");
    }

}//Class sonu
