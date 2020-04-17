import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arr_a = a.toLowerCase().toCharArray();
        char[] arr_b = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(arr_a);
        java.util.Arrays.sort(arr_b);

        return java.util.Arrays.equals(arr_a,arr_b);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
