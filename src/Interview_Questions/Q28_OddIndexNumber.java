package Interview_Questions;

import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String mtn= input.nextLine();
        for (int i = 0; i < mtn.length(); i++) {
            if(i%2==1)
                System.out.print(mtn.charAt(i)+" ");
        }
    }
}