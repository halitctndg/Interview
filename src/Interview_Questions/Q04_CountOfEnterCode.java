package Interview_Questions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hak=0;
        String pin="javvaNURjavaNAZjavaSU";
        do {
            System.out.println("Pin giriniz:");
            String pin2= input.next();
            hak++;
            if(pin.equals(pin2)){
                System.out.println("Pin doğru.HOŞGELDİNİZ");
                break;
            }
            else
                System.out.println("Yanlış pin.Tekrar deneyiniz:Kalan hak= "+(3-hak));
            if(hak==3)
                System.out.println("3 kere yanlış pin girdiniz.Müşteri hizmetlerini arayınız");
        }while (hak!=3);

    }
}
