package Interview_Questions;

import java.util.*;

public class Q37_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rastgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir

    public static void main(String[] args) {
        int[] sayilar= {1,7,54,15,68,74,75,12,92,0};
        List<Integer> sayiList=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println("sayiList = " + sayiList);//[1, 7, 54, 15, 68, 74, 75, 12, 92, 0]
        System.out.println("sayiList.set(2,7000) = " + sayiList.set(2, 7000));//54 döner.Çünki set ettiği eleman 54
        System.out.println("sayiList = " + sayiList);//[1, 7, 7000, 15, 68, 74, 75, 12, 92, 0]


    }
}
