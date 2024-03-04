package Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayı kadar FIBONACCI dizisini print eden code create ediniz.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int b=1;
        int c=1;
        System.out.print(1+" ");
        for (int i = 0; i <sayi ; i++) {
            System.out.print(b + " ");
            b = b + c;
            c = b - c;
        }
        System.out.println();
        System.out.println("***2.YOL***");
        System.out.println("Bir sayı daha giriniz:");
        int sayi2= input.nextInt();
        List<Integer> fibonacciList=new ArrayList<>();
        if(sayi<=0){
            System.out.println("Düzgün bir sayı gir:");
        }
        else if(sayi==1) {
            fibonacciList.add(1);
            System.out.println(fibonacciList);
        }
        else if(sayi==2) {
            fibonacciList.add(1);
            fibonacciList.add(1);
            System.out.println(fibonacciList);
        }
        else{
            int x=1;
            int y=1;
            int z;
            fibonacciList.add(x);
            fibonacciList.add(y);
            for (int i = 3; i <=sayi2 ; i++) {
                z=x+y;
                fibonacciList.add(z);
                x=y;
                y=z;
            }
            System.out.println(fibonacciList);
        }
    }
}