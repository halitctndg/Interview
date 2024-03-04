package Interview_Questions;

import java.util.Scanner;

public class Q07_IsDigit {
      /* Task->
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir string ifade giriniz:");
        String str= input.nextLine();
        System.out.println("Girdiğiniz stringdeki rakamların toplamı= "+sayilariTopla(str));

    }//main sonu

    private static int sayilariTopla(String str) {
        int toplam=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                toplam+=Integer.parseInt(String.valueOf(str.charAt(i)));
                // yada---->  toplam+=Integer.parseInt(str.substring(i,i+1));
                // yada---->  toplam+=Integer.valueOf(String.valueOf(str.charAt(i));
                // yada---->  toplam+=Integer.valueOf(""+str.charAt(i));
                //yada----->Character.getNumericValue(str.charAt(i));

            }
        }
        return toplam;
    }
}//Class sonu
