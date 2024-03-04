package Interview_Questions;

import java.util.Scanner;

public class Q27_AtbashCode {
    /*  Task->
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";

      Girilen bir str'nin AtbashCode print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String mtn= input.nextLine().toLowerCase().replace(" ","");
        String alfabe="abcdefghijklmnopqrstuvwxyz";
        String atbashCode="zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i < mtn.length(); i++) {
            for (int j = 0; j < atbashCode.length(); j++) {
                if(mtn.charAt(i)==alfabe.charAt(j)){
                    System.out.print(atbashCode.charAt(j));
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("***2.YOL***");
        String bos="";
        for (int i = 0; i < mtn.length(); i++) {
            bos+=atbashCode.charAt(alfabe.indexOf(mtn.charAt(i)));
        }
        System.out.println("bos = " + bos);


    }
}