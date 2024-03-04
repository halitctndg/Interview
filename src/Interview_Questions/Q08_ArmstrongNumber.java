package Interview_Questions;

import java.util.Scanner;

public class Q08_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int rakamlarKupToplam=0;
        int girilenSayi=sayi;
        while(sayi>0){
            rakamlarKupToplam+= (int) Math.pow(sayi%10,3);
            sayi/=10;
        }
        if(rakamlarKupToplam==girilenSayi)
            System.out.println("Girilen sayı armstrongdur.");
        else
            System.out.println("Girilen sayı armstrong değildir.");



    }


}
