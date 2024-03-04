package Interview_Questions;

import java.util.Arrays;

public class Q44_PrintArray {
    //Task->
    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {
        String[] names={"Ali","Veli","Hasan","Halit","Osman","Zuhal"};
        metot(names);

    }

    private static void metot(String[] names) {
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
    }
}
