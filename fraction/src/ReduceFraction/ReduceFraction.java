/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReduceFraction;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the numerator:");
        int a=in.nextInt();
        System.out.print("Enter the denominator:");
        int b=in.nextInt();
        int c=gcd(a,b);
        System.out.print(a+"/"+b+" can be written as ");
        a=a/c;
        b=b/c;
        if(b!=1){
            System.out.println(a+"/"+b);
        }else{
            System.out.println(a);
        }
    }
    
}
