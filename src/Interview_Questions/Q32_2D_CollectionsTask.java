package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q32_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın
    //[[Ahmet, Ali, Emrah, Elif, tecnical support], [Haluk, Eylul, Yusuf, Can, İbrahim, Mehmet], [Amazon, Google, Testinium, IBM]]


    public static void main(String[] args) {
        ArrayList<String> calisanlar=new ArrayList<>(Arrays.asList("Ali","Ayşe","Fatma"));
        ArrayList<String> isVerenler=new ArrayList<>(Arrays.asList("Asan","Aysun","Fatih","Halit","Hüso"));
        ArrayList<String> sirketler=new ArrayList<>(Arrays.asList("Amazon","Google","Clarusway"));
        List<ArrayList<String>> arrr=new ArrayList<>(Arrays.asList(calisanlar,isVerenler,sirketler));
        System.out.println("arrr = " + arrr);

    }
}

