package Interview_Questions;

import java.util.Scanner;

public class Q39_UseContinue {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi hariç teker teker  alt alta print eden code create ediniz.
         */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String mtn= input.nextLine();
        for (int i = 0; i <mtn.length() ; i++) {
            if(!(mtn.charAt(i)=='a'||mtn.charAt(i)==' ')){
                System.out.println(mtn.charAt(i));
            }
        }

    }
}
