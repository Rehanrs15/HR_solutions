/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuildLinkedList buildlinkedlist = new BuildLinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("press 0-toexit");
        while(true){
            System.out.println("1-insert,2-delete,3-isEMpty,4-display,5-reverse,"
                    + "6-delete paricularindex element");
            int input = in.nextInt();
            switch(input){
                case 1:
                    System.out.print("enter the element :");
                    int i = in.nextInt();
                    buildlinkedlist.insert(i);
                    break;
                    
                case 2:
                    buildlinkedlist.delete();
                    break;
                    
                case 3:
                    if(buildlinkedlist.isEmpty())
                        System.out.println("EMPTY");
                    else
                        System.out.println("NOT EMPTY");
                        
                    break;
                    
                case 4:
                    buildlinkedlist.display();
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                    
                case 5:
                    buildlinkedlist.reverseList();
                    break;
                    
                case 6:
                    System.out.print("enter the index :");
                    int index = in.nextInt();
                    System.out.println("deleted element :"+buildlinkedlist.deleteParticularIndexElement(index));
                    break;
                    
                case 7:
                    buildlinkedlist.joinList();
                    break;
                    
                    
                    
                            
                    
            }
        }
    }
    
}
