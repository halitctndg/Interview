package Interview_Questions;

import java.util.*;

public class Q33_ListCollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 br saga kaydir ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        soru1();
        soru2();
    }
    private static void soru1() {
        List<Integer> sayiList=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Bir sayı giriniz:");
            sayiList.add(input.nextInt());
        }
        System.out.println("***Listeyi tersten yazdırmak***");
        for (int i = sayiList.size()-1; i >=0 ; i--) {
            System.out.print(sayiList.get(i)+" ");
        }
        System.out.println();
        System.out.println("***Listeyi karıştırıp yazdırmak***");
        Collections.shuffle(sayiList);
        System.out.println("sayiList = " + sayiList);
        System.out.println("***Listeyi 3 br sağa kaydırıp yazdırmak***");
        int temp1= sayiList.get(0);
        int temp2= sayiList.get(1);
        sayiList.remove(0);
        sayiList.remove(0);
        sayiList.add(temp1);
        sayiList.add(temp2);
        System.out.println("sayiList = " + sayiList);
/*
        Karıştırma işleminin algoritması
        public static void customShuffle(List<?> list) {
        Random rnd = new Random();
        int size = list.size();
        for (int i = size; i > 1; i--) {
            int j = rnd.nextInt(i);
            swap(list, i - 1, j);
        }
        }

        private static void swap(List<?> list, int i, int j) {
        if (i != j) {
            // Swap işlemi
            list.set(i, list.set(j, list.get(i)));
        }
         */



    }
    public static void soru2() {
        List<Integer> sayiList=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Bir sayı giriniz:");
            sayiList.add(input.nextInt());
        }
        Collections.sort(sayiList);
        int max= sayiList.get(sayiList.size()-1);
        System.out.println("max = " + max);
        int min= sayiList.get(0);
        System.out.println("min = " + min);
        System.out.println("sayiList = " + sayiList);
        Collections.replaceAll(sayiList,max,min);
        System.out.println("sayiList = " + sayiList);
    }
}
