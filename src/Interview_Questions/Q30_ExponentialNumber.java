package Interview_Questions;

import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir taban sayısı giriniz:");
        int taban= input.nextInt();
        System.out.println("Üs sayısı giriniz:");
        int us= input.nextInt();
        int sonuc= (int) Math.pow(taban,us);
        System.out.println("sonuc = " + sonuc);
        System.out.println("***2.YOL***");
        int sonuc2=1;
        for (int i = 0; i < us; i++) {
            if(i==us-1){
                sonuc2*=taban;
                System.out.print(taban);
            }
            else {
                sonuc2*=taban;
                System.out.print(taban+"*");
            }
        }
        System.out.println("=" + sonuc2);
    }
}
