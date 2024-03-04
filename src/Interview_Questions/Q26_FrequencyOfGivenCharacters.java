package Interview_Questions;

import java.util.Scanner;

public class Q26_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı)  print eden   METHOD create ediniz..

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String mtn= input.nextLine();
        String[] arr=mtn.split("");
        karakterTekrariSay(arr);

    }//main sonu
    private static void karakterTekrariSay(String[] arr) {
        int count=0;
        String output="";
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if(!output.contains(arr[i])){
                output+=arr[i]+"="+count+"   ";

            }
        }
        System.out.println(output);
    }
}//Class sonu
