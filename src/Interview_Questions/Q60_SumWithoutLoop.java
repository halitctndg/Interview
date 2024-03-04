package Interview_Questions;

import java.util.Scanner;

public class Q60_SumWithoutLoop {
   /*
   Task-> girilen sayıya kadar olan pozitif tamsayıların toplamını loop kullanmadan print eden code create ediniz.
    */


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        System.out.println((sayi*(sayi+1))/2);
    }//main sonu


}
