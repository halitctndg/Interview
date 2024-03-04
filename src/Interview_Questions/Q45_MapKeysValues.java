package Interview_Questions;

import java.util.*;

public class Q45_MapKeysValues {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?

    public static void main(String[] args) {
        List<String> ulkeList=new ArrayList<>(Arrays.asList("Türkiye","Almanya","Hollanda","Çin","Rusya"));
        List<Integer> nufus=new ArrayList<>(Arrays.asList(85000000,72000000,2000000,2000000000,375000000));
        System.out.println("ulkeList = " + ulkeList);
        System.out.println("nufus = " + nufus);
        keyset();
        values();
        long toplam=0;
        for (int i = 0; i < nufus.size(); i++) {
            toplam+=nufus.get(i);
        }
        System.out.println("Nüfuslar toplamı = " + toplam);
        int count=0;
        for (int i = 0; i < nufus.size(); i++) {
           if(nufus.get(i)>50000000)
               count++;
        }
        System.out.println(count+" tane nüfusu 50 milyondan fazla ülke var");

    }
    private static void keyset() {
        List<String> ulkeList2=new ArrayList<>(Arrays.asList("Türkiye","Almanya","Hollanda","Çin","Rusya"));
        System.out.println("ulkeList2 = " + ulkeList2);
    }
    private static void values() {
        List<Integer> nufus2=new ArrayList<>(Arrays.asList(85000000,72000000,2000000,2000000000,375000000));
        System.out.println("nufus2 = " + nufus2);
    }


}
