import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet b[] = new BitSet[3];
        BitSet b1 = new BitSet(n); // bits are intialized to 0
        BitSet b2 = new BitSet(n); 

        b[1] = b1;
        b[2] = b2;

        while(m>0){
            String s = sc.next(); // nextLine will take the whole line as input
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch(s){
                case "AND": b[x].and(b[y]);break;
                case "OR": b[x].or(b[y]);break;
                case "XOR": b[x].xor(b[y]);break;
                case "FLIP": b[x].flip(y);break;
                case "SET": b[x].set(y);break;
            }
            System.out.printf("%d %d%n",b[1].cardinality(),b[2].cardinality());
            //cardinality() returns the number of set bits(i.e. 1s) in the bit set
            m--;
        }
    }
}