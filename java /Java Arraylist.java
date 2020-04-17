import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            ArrayList<Integer> subList = new ArrayList<Integer>();
            int m = scan.nextInt();
            for(int j=0;j<m;j++)
                subList.add(scan.nextInt());
            list.add(subList);
        }

        int query = scan.nextInt();
        for(int i=0;i<query;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x-1<=list.size()){
                if(y-1<list.get(x-1).size()){
                    System.out.println(list.get(x-1).get(y-1));
                }
                else{
                    System.out.println("ERROR!");
                }
            }else{
                System.out.println("ERROR!");
            }
        }
    } 
}
