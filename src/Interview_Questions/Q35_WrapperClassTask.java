package Interview_Questions;

import java.util.Scanner;

public class Q35_WrapperClassTask {
 /* Task->
     create a method that accepts an int
     and returns twice of that int
     overload this method with wrapper class: Integer

     int parametreli ve parametrenin 2 katını return eden method create ediniz.
     Bu methodu Wrapper class ile overload ediniz.
      */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println( "Bir sayı giriniz:");
        int sayi= input.nextInt();
        System.out.println("Girdiğiniz sayının iki katı= " + ikiKati(sayi));
        System.out.println("Girdiğiniz sayının iki katı= " + ikiKati(sayi));

    }

    private static int ikiKati(int sayi) {
        return sayi*2;
    } private static int ikiKati(Integer sayi) {
        return sayi*2;
    }


}//Class sonu

