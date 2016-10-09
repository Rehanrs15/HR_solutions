/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        BuildQueue buildQueue = new BuildQueue();
        Scanner input = new Scanner(System.in);
        System.out.println("press 0- toexit");
        while(true){
            System.out.println("press 1-insert, 2- delete, 3-check empty, 4-display");
            int value = input.nextInt();
            switch(value){
                case 1:
                    System.out.println("enter the element-");
                    int element = input.nextInt();
                    buildQueue.insert(element);
                    break;
                    
                case 2:
                    
                        System.out.println("Deleted Element -"+" "+buildQueue.delete() );
                   
                    break;
                    
                case 3:
                    if(buildQueue.isEmpty())
                        System.out.println("Queue Empty");
                    else
                        System.out.println("Not Empty");
                    break;
                   
                case 4:
                    buildQueue.display();
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                    
            }
        }
        
    }
    
}
