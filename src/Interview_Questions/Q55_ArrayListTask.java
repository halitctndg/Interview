package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q55_ArrayListTask {


    public static void main(String[] args) {
			/* Task->
			create an array list of cars and retrieve all the value using 3 different ways
			3 elemanlı bir araba listi tanımlayıp 3 farklı yontem ile elemanları print eden code create ediniz.
			 */
        /*
         * Create an arrayList of drinks.
         * If any drink has letter 'a' or 'e' replace it with water.
         */
        List<String> arabalar=new ArrayList<>(Arrays.asList("BMW","FİAT","RENAULT"));
        System.out.println("arabalar = " + arabalar);
        for (int i = 0; i < arabalar.size(); i++) {
            System.out.print( arabalar.get(i)+" ");
        }
        System.out.println();

        List<String> drinks=new ArrayList<>(Arrays.asList("Pepsi","Ayran","Şalgam","Kivi","Limon","Soda","Su"));
        for (int i = 0; i < drinks.size() ; i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println("drinks = " + drinks);


    }
}
