//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
        Map phonebook = new HashMap();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=Integer.parseInt(in.nextLine());
            phonebook.put(name, phone);
		}
        
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phonebook.containsKey(s))
                System.out.println(s+"="+phonebook.get(s));
            else
                System.out.println("Not found");
		}
	}
}



