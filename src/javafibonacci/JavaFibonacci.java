/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaFibonacci {

    public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Inputkan Deret Fibonacci : ");
        int n = show.nextInt();
        long angka[] = new long[n];
         
        angka[0] = 1;
        angka[1] = 1;
         
        for(int i = 2; i < n; i++) {
            angka[i] = angka[i-1] + angka[i-2];
        }
         
    }
}
