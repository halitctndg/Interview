package Interview_Questions;

import java.util.*;

public class Q36_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin

        //Bu yaptığım yol yukarıda verilen list için çalışıyor.Ama eleman ikiden fzla tekrarlanmışsa çalışmada hata var.
    public static void main(String[] args) {
        List<Integer> sayiList=new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        List<Integer> sayiList2=new ArrayList<>();

        int count=0;
        for (int i = 0; i < sayiList.size() ; i++) {
            for (int j = i+1; j < sayiList.size() ; j++) {
                if(sayiList.get(i)== sayiList.get(j)){
                    System.out.print(sayiList.get(i)+" ");
                    count++;
                }


            }
        }
        System.out.println();
        System.out.println(count+" tane kopya var.");


    }
}
