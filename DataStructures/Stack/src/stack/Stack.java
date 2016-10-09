/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        BuildStack buildStack = new BuildStack();
        Scanner input = new Scanner(System.in);
        System.out.println("press 0- toexit");
        while(true){
            System.out.println("press 1-insert, 2- delete, 3-check empty, 4-display");
            int value = input.nextInt();
            switch(value){
                case 1:
                    System.out.println("enter the element-");
                    int element = input.nextInt();
                    buildStack.push(element);
                    break;
                    
                case 2:
                    
                        System.out.println("Deleted Element -"+" "+buildStack.pop() );
                   
                    break;
                    
                case 3:
                    if(buildStack.isEmpty() == 1)
                        System.out.println("Stack Empty");
                    else
                        System.out.println("Not Empty");
                    break;
                   
                case 4:
                    buildStack.display();
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                    
            }
        }
        
    }
    
}
