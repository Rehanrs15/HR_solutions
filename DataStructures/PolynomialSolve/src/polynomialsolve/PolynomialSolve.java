/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polynomialsolve;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class PolynomialSolve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Create c = new Create();
        int choice;
        do{
            System.out.println("enter 1- insert,2-display");
            choice = in.nextInt();
            
            switch(choice){
                
                case 1:
                    System.out.println("num,pow,exp-num");
                    int num = in.nextInt();
                    int pow = in.nextInt();
                    int type = in.nextInt();
                    c.insert(num, pow, type);
                    break;
                    
                case 2:
                    c.Display();
                    break;
                    
                case 3:
                    c.Solve();
                    break;
                      
            }
        }while(choice != 4);
    }
    
}
