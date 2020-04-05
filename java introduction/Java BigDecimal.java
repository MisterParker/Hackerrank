import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //1 Write your code here
        Comparator<String> c = new Comparator<String>(){
            public int compare(String s1, String s2){
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);

                return b2.compareTo(b1);
            }
        };

        Arrays.sort(s, 0, n, c); // Arrays take 4 parameters o,n -> are index as s is till n+2 so we need to limit it

        //2 using Lambda
        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>(){
            public int compare(String s1, String s2){
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);

                return b1.compareTo(b2);
            }
        }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}