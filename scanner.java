
package oops;
import java.util.Scanner;

public class Array {
    
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
   // System.out.println("enter the size of array");
    int n = sc.nextInt();
    
    int [] num = new int [n];
    //int i=0;
    for(int i =0;i<n;i++)
    {
        num[i] = sc.nextInt();
    }
    
    for(int i =0;i<n;i++)
    {
      System.out.println(num[i]);
    }
    }
}
