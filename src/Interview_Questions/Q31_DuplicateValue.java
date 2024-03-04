package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q31_DuplicateValue {
       /* Task->
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Girilen bir string için tekrarlanan karakterleri print eden code create ediniz.
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String str = input.nextLine().replaceAll(" ","");
        List<String> karakters=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(!(karakters.contains(""+str.charAt(i)))){
                karakters.add(""+str.charAt(i));
            }
        }
        System.out.println("karakters = " + karakters);
    }
}

