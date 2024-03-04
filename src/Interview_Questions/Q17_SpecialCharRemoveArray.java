package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q17_SpecialCharRemoveArray {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("$-13", "$0", "$0"));
        System.out.println("getSum(list) = " + getSum(list));

    }//main sonu

    private static int getSum(List<String> list) {
        int toplam=0;
        for (int i = 0; i < list.size() ; i++) {
            toplam+=Integer.parseInt(list.get(i).replace("$",""));
        }
        if(toplam<0){
            return -1;
        }
        else
            return toplam;
    }


}//Class sonu