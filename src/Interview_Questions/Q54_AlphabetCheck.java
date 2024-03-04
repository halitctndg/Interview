package Interview_Questions;

import java.util.Scanner;

public class Q54_AlphabetCheck {

    public static void main(String[] args) {
        // Task->
        // Check if the character is among a-z or A-Z
        // girilen karakterin a-z or A-Z arasında olmasını kontrol eden code create ediniz
        Scanner inut=new Scanner(System.in);
        System.out.println("Bir karakter gir");
        char x=inut.next().charAt(0);
        karakterCheck(x);
    }

    private static void karakterCheck(char x) {
        if((x>='a'&&x<='z')||x>='A'&&x<='Z')
            System.out.println("Harf aralığında");
        else
            System.out.println("Harf aralığında değil");
    }
}
