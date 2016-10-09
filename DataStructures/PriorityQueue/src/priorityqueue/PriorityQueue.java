/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqueue;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class PriorityQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        BuildPriorityQueue build = new BuildPriorityQueue();
        System.out.println("enter 0 - exit");
        while(true){
            System.out.println("1-insert,2-delete,3-empty,4-display");
            int read = in.nextInt();
            switch(read){
                case 1:
                    System.out.print("enter the element : ");
                    int element = in.nextInt();
                    System.out.print("enter the priority : ");
                    int priority = in.nextInt();
                    build.insert(element, priority);
                    break;
                    
                case 2:
                    System.out.print("enter the priority # to delete :");
                    int prio = in.nextInt();
                    int deltedElement = build.delete(prio);
                    System.out.println("Deleted element is"+ " " +deltedElement);
                    break;
                    
                case 3:
                    if(build.isEmpty())
                        System.out.println("EMpty");
                    else
                        System.out.println("Not Empty");
                    break;
                    
                case 4:
                    build.display();
                    break;
                    
                
            }
            
        }
    }
    
}
