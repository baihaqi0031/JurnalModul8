/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamodifiedsumoffibonacci;

/**
 *
 * @author Praktikan
 */
public class JavaModifiedSumOfFibonacci {

    /**
     * @param args the command line arguments
     */
static int SumFibo(int n)
    {
        if (n <= 0)
           return 0;
      
        int fib[]=new int[n+1];
        fib[0] = 0; fib[1] = 1;
      
        // Initialize result
        int sum = fib[0] + fib[1];
      
        // Add remaining terms
        for (int i=2; i<=n; i++)
        {
            fib[i] = fib[i-1]+fib[i-2];
            sum += fib[i];
        }
      
        return sum;
    }
      
    // Driver program to test above function
    public static void main(String args[])
    {
        int n = 4;
        System.out.println("Input : "+n);
        System.out.println("Output : "+ SumFibo(n));
    }
}
