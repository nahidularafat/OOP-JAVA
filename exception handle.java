
package exceptionex;
import java.util.Scanner;

public class Exceptionex {

    public static void main(String[] args) {
      
        int i=5;
        int k = 324 ;
        int j= 9;
        
        try
        {
            j= k/i;
            System.out.println("the number is "+j);
        }
        catch(Exception e)
        {
            System.out.println("here i am");
        }
    }
    
}
