package Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q15_HackerLanguage {

// Task->Girilen bir metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) create ediniz.
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String mtn= input.nextLine();
        //1.YOL
        hackerDili(mtn);
        System.out.println();
        //2.YOL
        hackerDili1(mtn);

    }//main sonu

    private static void hackerDili1(String mtn) {
        String[] arr=mtn.split("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("s")) arr[i]="5";
            if(arr[i].equals("a")) arr[i]="4";
            if(arr[i].equals("e")) arr[i]="3";
            if(arr[i].equals("i")) arr[i]="1";
            if(arr[i].equals("o")) arr[i]="0";
            System.out.print(arr[i]);
        }


    }

    private static void hackerDili(String mtn) {
        mtn=mtn.replace("s","5");
        mtn=mtn.replace("a","4");
        mtn=mtn.replace("e","3");
        mtn=mtn.replace("i","1");
        mtn=mtn.replace("o","0");
        System.out.println(mtn);
    }


}// Class sonu