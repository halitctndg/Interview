package Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
        Task-> Girilen bir String value için  herbir character'in sayisini print eden code create ediniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
               abaa   ==> a=3  b=1
       */
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Bir string ifade giriniz:");
       String str= input.nextLine();
       String[] strArr=str.split("");//str'nin herbir parçası array'e atandı
       System.out.println("str = " + str);
       System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
       int count=0;
       String output="";
       for (int i = 0; i < strArr.length ; i++) {
           count=0;
           for (int j = 0; j < strArr.length; j++) {
               if (strArr[i].equals(strArr[j])){
                   count++;
               }
           }
           if(!output.contains(strArr[i])){
               output+=strArr[i]+"="+count+"   ";

           }
       }
       System.out.println("output = " + output);
       //2.YOL
       count = 0;
       output = "";
       for (int i = 0; i < str.length(); i++) {
           count = 0;
           for (int j = 0; j < str.length(); j++) {
               if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
                   count++;
               }
           }
           if (!output.contains(String.valueOf(str.charAt(i)))) {
               output += "" + String.valueOf(str.charAt(i)) + count + " ";
           }
       }
       System.out.println("output=" + output);

   }
}
