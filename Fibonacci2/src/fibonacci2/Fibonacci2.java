/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci2;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class Fibonacci2 {

    /**
     * @param args the command line arguments
     */
    public static int fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the term number:");
        int n=in.nextInt();
        System.out.println("the fibonacci number for this term is "+fibonacci(n));
    }
}
    
