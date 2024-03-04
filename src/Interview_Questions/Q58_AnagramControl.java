package Interview_Questions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Q58_AnagramControl {
    public static void main(String[] args) {
		/*
		    Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java method create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
        String word1="listen";
        String word2="Silent";
        System.out.println("isAnagram(word1,word2) = " + isAnagram(word1, word2));
        System.out.println("isAnagram(\"salih\",\"HALİS\") = " + isAnagram("salih", "HALİS"));
        System.out.println("isAnagram(\"hannassah\",\"SahANnaHS\") = " + isAnagram("hannassah", "SahANnaHS"));
        System.out.println("isAnagram(\"Ali\",\"ömer\") = " + isAnagram("Ali", "ömer"));
        System.out.println("isAnagram(\"AYŞE\",\"eşya\") = " + isAnagram("AYŞE", "eşya"));
        System.out.println("isAnagram(\"Fatma\",\"ayça\") = " + isAnagram("Fatma", "ayça"));


    }//main sonu

    private static boolean isAnagram(String word1, String word2) {
        String[] one=word1.toLowerCase().split("");
        String[] two=word2.toLowerCase().split("");
        Arrays.sort(one);
        Arrays.sort(two);
        if(Arrays.equals(one, two))
            return true;
        else
            return false;
    }


}//Class sonu
