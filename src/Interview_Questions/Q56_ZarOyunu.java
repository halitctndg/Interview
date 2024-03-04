package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56_ZarOyunu {
    /* Task->
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" ,
     aksi takdirde "Tekrar deneyiniz" print eden code create ediniz

     */

    public static void main(String[] args) {
        List<Integer> zar1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> zar2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int zarAtis1=1+(int)(Math.random()*5);
        int zarAtis2=1+(int)(Math.random()*5);
        System.out.println(zarAtis1);
        System.out.println(zarAtis2);
        System.out.println(zar1.get(zarAtis1));//ilk zardan gelen sayı
        System.out.println(zar2.get(zarAtis2));//ikinci zardan gelen sayı
        if((zar1.get(zarAtis1)+zar2.get(zarAtis2))==9){
            System.out.println("Kazandınız");
        }
        else
            System.out.println("Tekrar deneyiniz");
    }
}
