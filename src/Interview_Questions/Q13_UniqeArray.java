package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_UniqeArray {
    /* task->
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array print eden code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!sayilar.contains(arr[i]))
                sayilar.add(arr[i]);
        }
        System.out.println("sayilar = " + sayilar);
        //bu list'i başka bir array'e atayacam.

        //Object[] tekrarsizArray=sayilar.toArray() metodu ile direkde yapabiliriz ama alttaki daha iyi
        int[] tekrarsizArray=new int[sayilar.size()];
        for (int i = 0; i < tekrarsizArray.length; i++) {
            tekrarsizArray[i]= sayilar.get(i);
        }
        System.out.println("Arrays.toString(tekrarsizArray) = " + Arrays.toString(tekrarsizArray));
    }
}
/*          FARKLI BİR YOL
        List<Integer> nums=new ArrayList<>();
        for (int each:arr){
            nums.add(each);
        }
        System.out.println("nums = " + nums);
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j <nums.size() ; j++) {
                if (nums.get(i)==nums.get(j)){
                    nums.remove(j);
                }
            }
        }
        System.out.println("nums = " + nums);

 */




