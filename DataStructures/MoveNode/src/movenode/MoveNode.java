/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movenode;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class MoveNode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        BuildList buildlinkedlist = new BuildList();
        Scanner in = new Scanner(System.in);
        System.out.println("press 0-toexit");
        while(true){
            System.out.println("1-insert,2-move,3-copy,4-average");
            int input = in.nextInt();
            switch(input){
                case 1:
                    System.out.print("enter the element :");
                    int i = in.nextInt();
                    buildlinkedlist.insert(i);
                    break;
                    
                case 2:
                    System.out.print("enter the Node # :");
                    int i1 = in.nextInt();
                    System.out.print("enter the position # :");
                    int i2 = in.nextInt();
                    buildlinkedlist.Move(i1, i2);
                    break;
                    
                case 3:
                    buildlinkedlist.Copy();
                    break;
                    
                case 4:
                    System.out.println("AVERAGE : "+buildlinkedlist.Average());
                    break;
                   
            }
        }
    }
    
}
