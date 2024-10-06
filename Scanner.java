package basic;

import java.util.Scanner;

public class BASIC {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
         System.out.println(" Enter the size  : ");
        int n = sc.nextInt();
        
        int [] num = new int[n];
        
        System.out.println(" Enter the array  : ");
        for(int i=0;i< n; i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0;i< n; i++)
        {
            System.out.println(num[i]);
        }
        
    }
}
