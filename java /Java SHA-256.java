import java.io.*;
import java.util.*;
import java.math.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            byte[] b = s.getBytes();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash_digest = md.digest(b);
            BigInteger hash_signum = new BigInteger(1,hash_digest);
            String hash_text = hash_signum.toString(16);

            while(hash_text.length() < 64){
                hash_text = "0" + hash_text;
            }

            System.out.println(hash_text);
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}