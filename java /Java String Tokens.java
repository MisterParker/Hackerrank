import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        
        String[] arrs = s.trim().split("[ !,?.\\_'@]+");
        if (s == null || s.equals("") || s.trim().equals("")){
            System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(arrs.length);
        }

        for(String arr : arrs){
            System.out.println(arr);
        }

        scan.close();
    }
}

