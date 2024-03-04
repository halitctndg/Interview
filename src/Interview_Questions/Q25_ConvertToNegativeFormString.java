package Interview_Questions;

import java.util.Arrays;

public class Q25_ConvertToNegativeFormString {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String output="";
        for (int i = 0; i < arr.length ; i++) {
            if(i==6){
                output+="NOT";
            }
            output+=arr[i];
        }
        System.out.println(output);
        System.out.println("***2.YOL***");
        String str="";
        for (int i = 0; i < arr.length ; i++) {
            str+=arr[i];
        }
        System.out.println("str.replace(\"Is\",\"IsNOT\") = " + str.replace("Is", "IsNOT"));
        System.out.println("***3.YOL***");




    }
}
