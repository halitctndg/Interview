package Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q18_MultipleMethodVarargs {
    /* Task->
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	print eden  parametreli method create ediniz.
	varargs ile çözülecek
 */
    public static void main(String[] args) {
        notHesapla("Yucel",85,77,66,83,51,61);
        notHesapla("Sema",99,85,91,77);
        notHesapla("Saim",90,53,87);
        notHesapla("Safvet",91,87,56,43,71);

    }
    private static void notHesapla(String isim, double... notes) {
        double toplam=0;
        double ortalama=0;
        for(double avuc:notes){
            toplam+=avuc;
        }
        System.out.println(isim+" not ortalaması "+(toplam/ notes.length));//yuvarlamak için math.round() kullanabiliriz.
    }


}//Class sonu
