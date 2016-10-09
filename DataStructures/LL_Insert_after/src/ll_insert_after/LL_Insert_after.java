/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ll_insert_after;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class LL_Insert_after {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuildList buildlinkedlist = new BuildList();
        Scanner in = new Scanner(System.in);
        System.out.println("press 0-toexit");
        while(true){
            System.out.println("1-insert,2-position & element 3- display");
            int input = in.nextInt();
            switch(input){
                case 1:
                    System.out.print("enter the element :");
                    int i = in.nextInt();
                    buildlinkedlist.insert(i);
                    break;
              
                    
                case 2:
                    System.out.print("enter the element :");
                    int i1 = in.nextInt();
                    System.out.print("enter the position :");
                    int i2 = in.nextInt();
                    buildlinkedlist.insertAfter(i1, i2);
                    break;         
                    
                case 3:
                    buildlinkedlist.display();
                    break;
                    
            }
        }
    }
    }
   
