import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());
        int q = sc.nextInt();
        while(q>0){
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x,y);
            }
            else{
                int x = sc.nextInt();
                list.remove(x);
            }
            q--;
        }

        for(Integer e : list)
            System.out.print(e+" ");
    }
}