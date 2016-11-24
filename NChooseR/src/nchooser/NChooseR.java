/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nchooser;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the N:");
        int n=in.nextInt();
        System.out.print("Enter the R:");
        int r=in.nextInt();
        System.out.println("N choose R equals:"+fact(n)/fact(r)/fact(n-r));
    }
    
}
