package Interview_Questions;

import java.util.Scanner;

public class Q06_FrequencyWithStringVaalueOf {
    /* Task->
  Count the frequency of the letters in a given String as the format below:
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
  "Java is so Good" stringi için kullanılan harflern tekrarını print eden code create ediniz.
   */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir string ifade giriniz:");
        String str= input.nextLine();
        int count = 0;
        String output = "";
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
