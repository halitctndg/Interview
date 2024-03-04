package Interview_Questions;

import java.util.Scanner;

public class Q21_CountFactors {
    /* Task->
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Girilen sayının pozitif tam bolen sayısını print eden code create ediniz.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi= input.nextInt();
        int sayac=0;
        for (int bolen = 1; bolen <=sayi ; bolen++) {
            if(sayi%bolen==0) {
                System.out.print(bolen + " ");
                sayac++;
            }
        }
        System.out.println("===> "+sayac);
     }
}
