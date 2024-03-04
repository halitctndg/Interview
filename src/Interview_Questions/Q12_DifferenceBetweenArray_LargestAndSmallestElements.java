package Interview_Questions;

import java.util.*;



public class Q12_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println( "Kaç elemanlı array olacak?" );
        int boyut= input.nextInt();
        int[] arr=new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println("Array'in "+(i+1)+". elemanını giriniz.");
            arr[i]= input.nextInt();
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Bu en kolay yolu");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int sonuc=arr[arr.length-1]-arr[0];
        System.out.println("sonuc = " + sonuc);
        //sort metodunu kullanmadan yapılış yolu;
        System.out.println("***2.YOL***");
        int fark=max(arr)-min(arr);//Integer.MAX_VALUE ve Integer.MIN_VALUE metotlarıda var
        System.out.println("fark = " + fark);

    }

    private static int max(int[] arr) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    private static int min(int[] arr) {
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}