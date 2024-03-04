package Interview_Questions;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int count=0;
        if(sayi>=2){//girilen sayının 2'den büyüklüğü kontrol edildi.
            for (int i = 2; i < sayi; i++) {
                if(sayi%i==0){
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println(sayi+" asal sayıdır.");
            else
                System.out.println(sayi+" asal sayı değildir.");
        }
        else System.out.println("Girilen sayı asal değildir.");




    }
}
