package Interview_Questions;

import java.util.Scanner;

public class Q09_ArmstrongNumber_4Digits {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748
         soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız*/

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        System.out.println("armstrongKontrol(sayi) = " + armstrongKontrol(sayi));



        System.out.println("***2.SORU***");
        //daha kolay çözüm için string aldım sayıyı
        System.out.println("Bir sayı daha giriniz:");
        int sayi2= input.nextInt();
        girilenSayiyaKadarArmstrongKontrol(sayi2);
    }//main sonu
    private static String armstrongKontrol(int sayi) {
        String rakamlar=""+sayi;
        //int basamakSayisi=rakamlar.length();
        int kuvvetlerToplami=0;
        int girilenSayi=sayi;
        while (sayi>0){
            kuvvetlerToplami+= (int) Math.pow(sayi%10,rakamlar.length());
            sayi/=10;
        }
        return kuvvetlerToplami==girilenSayi?"Armstrong sayı":"Armstrong sayı değil";
    }
    private static void girilenSayiyaKadarArmstrongKontrol(int sayi2) {
        for (int i = 1; i <=sayi2 ; i++) {
            System.out.println(i+" "+armstrongKontrol(i));
        }
    }




}//Class sonu