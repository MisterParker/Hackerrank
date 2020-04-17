import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] ss = new String[s.length()-k+1];
        for(int i=0;i<ss.length;i++){
            ss[i] = s.substring(i,i+k);
        }

        String temp = "";

        for(int i=0;i<ss.length-1;i++){
            for(int j=i+1;j<ss.length;j++){
                if(ss[i].compareTo(ss[j])>0){
                    temp = ss[j];
                    ss[j] = ss[i];
                    ss[i] = temp;
                }
            }
        }

        smallest = ss[0];
        largest = ss[ss.length-1];
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}