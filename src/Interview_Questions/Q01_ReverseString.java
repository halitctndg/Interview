package Interview_Questions;

public class Q01_ReverseString {
        /* Task->
	     Stringi tersten print için
		1.Yol: StringBuilder () kullanarak
		2.Yol: String Classini kullanarak
		3.Yol: Bir method create ediniz
    */

    public static void main(String[] args) {
        String str="All is well";
        System.out.println("str = " + str);
        System.out.println("***1.YOL***");
        StringBuilder sb=new StringBuilder();
        sb.append(str);//append metodu ile sb'ye ekleme yaptık
        System.out.println("sb = " + sb);
        String reverseString=sb.reverse().toString();//Sring builder metodu ile reverse yaptık
        System.out.println("reverseString = " + reverseString);
        System.out.println("***2.YOL***");
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("***3.YOL***");
        reversString(str);


    }//main sonu

    private static void reversString(String str) {
        char[] arr=str.toCharArray();
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }

    }
}//class sonu
