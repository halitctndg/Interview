package Interview_Questions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir strin girin:");
        String mtn= input.nextLine();
        System.out.println("Kaç tekrar istiyorsun:");
        int n= input.nextInt();
        System.out.println("tekrarla(mtn,n) = " + tekrarla(mtn, n));
    }
    private static String tekrarla(String mtn, int n) {
        String str="";
        char ilk=mtn.charAt(0);
        char son=mtn.charAt(mtn.length()-1);
        for (int i = 0; i < n; i++) {
            str+=""+ilk+son;//yada char variable oluşturmadan direk-----> ""+mtn.charAt(0)+mtn.charAt(mtn.length()-1);
            //str+=mtn.substring(0,1)+mtn.substring(mtn.length()-1);
        }
        return str;
    }
}
