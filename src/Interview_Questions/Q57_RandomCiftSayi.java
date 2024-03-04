package Interview_Questions;

public class Q57_RandomCiftSayi {

    public static void main(String[] args) {
        //task->0-20 arasında  Math.random() kullanarak cikan sayinin cift ya da tek olmasını kontrol eden code create ediniz
        // Math.random()*((max-min)+1)+min); -> max ile min arası rastgele sayı ureten komut
        int sayi=(int)(Math.random()*21);
        System.out.println("sayi = " + sayi);
        System.out.println( sayi%2==0?true:false);



    }
}
