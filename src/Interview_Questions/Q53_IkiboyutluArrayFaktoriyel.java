package Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;


public class Q53_IkiboyutluArrayFaktoriyel {


    public static void main(String[] args) {
        // task-> girilen 3x3 iki boyutlu arrayin elemanlarının faktoriyelini print eden method create ediniz
        Scanner input =new Scanner(System.in);
        int[][] fakt= {{1,5,3},{2,4,3},{4,5,3}};

        System.out.println("Arrays.toString(fakt) = " + Arrays.deepToString(fakt));
        int[][] result=new int[3][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
               result[i][j]=faktor(fakt[i][j]);
            }
        }
        System.out.println("Arrays.deepToString(result) = " + Arrays.deepToString(result));


    }
    private static int faktor(int i) {
        int sonuc=1;
        for (int j = i; j >0 ; j--) {
            sonuc*=j;
        }
        return sonuc;
    }
}
