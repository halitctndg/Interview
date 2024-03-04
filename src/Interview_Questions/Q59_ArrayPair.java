package Interview_Questions;

import java.util.Scanner;

public class Q59_ArrayPair {
	
	
	 /* Task->
	   from a given array find all pairs whose sum is a  given number
	   Bir dizide istenen toplama eşit olan sayı ciftlerini print eden method create ediniz.
	   {4,6,5,-10,8,5,20}===>10
	    */
	
	public static void main(String[] args) {
		int[] sayi={4,6,5,-10,8,5,20};
		Scanner input=new Scanner(System.in);
		System.out.println("İstediğin toplam hangisi?");
		int toplam=input.nextInt();


		for (int i = 0; i < sayi.length; i++) {
			for (int j = i+1; j < sayi.length; j++) {
				istenenMi(sayi[i]+sayi[j],i,j,toplam);

			}

		}



		
	}//main sonu

	private static void istenenMi(int index,int i,int j,int total) {
		if(total==index){
			System.out.println(i+" ve "+j+" indexlerdeki elemanların toplamı istdiğin toplama eşittir. ");
		}

	}
}//Class sonu
