package Interview_Questions;

import java.util.Scanner;

public class Q63_FactorialWithoutLoop {
    /* task-> girilen tamsayının factoriel değerini loop kullanmadan print code create ediniz.
        0! = 1,     1! = 1,     2! = 2*1,   3! = 3*2*1,     6! = 6*5*4*3*2*1
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        System.out.println("Girdiğiniz sayının faktöriyeli " + fakt(sayi));


    }//main sonu
    private static int fakt(int sayi) {
        if(sayi != 1)
            return sayi * fakt(sayi - 1);
        return 1;
    }
}//Class sonu

