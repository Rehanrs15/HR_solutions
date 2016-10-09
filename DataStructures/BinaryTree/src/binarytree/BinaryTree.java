/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        CreateTree tree = new CreateTree();
        int choice = 0;
        System.out.println("enter 1-createnode,2 - insert,3 - display");
        choice = in.nextInt();
        while(true){
            switch(choice){
                    case 1:
                        tree.CreateNode();
                        break;
                        
                    case 2:
                        tree.Insert(in.nextInt());
                        break;
                        
                    case 3:
                        tree.display();
                        System.out.println("min = "+tree.min);
                        break;
                        
                    case 4:
                        tree.intilise();
                        break;
                        
                    case 5:
                        tree.printsiblings();
                        break;
                        
                    case 7:
                        tree.DepthOfTree();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    case 8:
                        tree.call(in.nextInt());
                        break;
                        
            }
            System.out.println("2 - insert,3 - display,4- number of leaf nodes,5-siblings,7 - height");
            choice = in.nextInt();            
        }
    }
    
}
