import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
              boolean matchFound = false;
              String regex = "<(.+)>([^<]+)</\\1>"; // () defines the group that are later called
              Pattern p = Pattern.compile(regex);
              Matcher m = p.matcher(line);

        
            while (m.find()) {
                System.out.println(m.group(2)); // means the content of the second paranthesis
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}



