package Interview_Questions;

import java.util.Scanner;

public class Q62_PrintPrimeNumbers {

    public static void main(String[] args) {
        /* Task->
         * Print prime numbers which are less than the given number
         *  Girilen sayıya kadar asal sayıları print eden code create ediniz
         * input : 10
         * output : 2 3 5 7
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int num=2;
        int count=0;
        do {
            for (int i= 2; i<num ; i++) {
                if(num%i==0){
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.print(num+" ");
            count=0;
            num++;

        }while(num!=sayi);



    }//main sonu
}//Class sonu
