package Interview_Questions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String ifade giriniz:");
        String str= input.nextLine();
        String[] karakterler=str.split("");
        for (int i = 0; i < karakterler.length; i++) {
            boolean b = karakterler[i].contains("i") || karakterler[i].contains("a") || karakterler[i].contains("e") ||
                    karakterler[i].contains("u") || karakterler[i].contains("o") || karakterler[i].contains("A") ||
                    karakterler[i].contains("E") || karakterler[i].contains("I") || karakterler[i].contains("U") ||
                    karakterler[i].contains("O");
            if(b) {
                System.out.print(karakterler[i]+" ");
            }
        }
        System.out.println("***2.YOL***");
        System.out.println("Bir String ifade giriniz:");
        String str2= input.nextLine();
        System.out.println("str2.replaceAll(\"[^aeiuoAEUIO]\",\"\") = " + str2.replaceAll("[^aeiuoAEUIO]", ""));


    }

}
