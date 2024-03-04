package Interview_Questions;

import java.util.Arrays;

public class Q43_Printing2DArray {

    // Task-> Print 2D String array using loops

    public static void main(String[] args) {
        int[][] sayilar={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+" ");

            }

        }


    }
}
