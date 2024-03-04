package Interview_Questions;

import java.util.*;

public class Q24_CountsOfRepeatingElement {
    /*  Task->
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
            Verilen arrayde istenen sayının tekrar saysını print eden code create ediniz.
     */
    public static void main(String[] args) {
        List<Integer> sayiList=new ArrayList<>(Arrays.asList(1,7,8,54,41,7,25,65,1,7,41,85,98,65));
        Scanner input=new Scanner(System.in);
        System.out.println("Hangi sayıyı sorgulayacan?");
        int sayi= input.nextInt();
        int count=0;
        for (int i = 0; i < sayiList.size(); i++) {
            if(sayiList.get(i)==sayi)
                count++;
        }
        System.out.println("Girdiğiniz "+sayi+" sayısından "+count+" tane var.");




    }





}
