
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   
   public static <A> void printArray(A[] inputArray){
       for(A element : inputArray)
        System.out.println(element);
   }

// hack for the above solution without using generics concept
//    public static void printArray(Object[] inputArray){
//        for(Object element : inputArray)
//         System.out.println(element);
//    }
 
}

public class Solution {