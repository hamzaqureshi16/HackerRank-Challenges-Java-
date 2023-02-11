/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Mhamz 
*/
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    
    public static void JavaLoopsII(){
        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();
        
        for(int i =0 ; i < queries ; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            
            int toPrint = a;
            for(int j = 0 ; j < n ; j++){
                toPrint = toPrint + (int)Math.pow(2, j)*b;
                System.out.print(toPrint+" ");
            }
        }
                
    }
    public static void main(String[] args) {
        JavaLoopsII();
    }
    
}
