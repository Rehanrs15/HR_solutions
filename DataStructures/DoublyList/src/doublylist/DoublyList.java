/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylist;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class DoublyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        ListBuilder buildlinkedlist = new ListBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("press 0-toexit");
        while(true){
            System.out.println("1-insert, 2 -deltee, 3- isEMpty,4-display");
            int input = in.nextInt();
            switch(input){
                 case 1:
                    System.out.print("enter the element :");
                    int i = in.nextInt();
                    buildlinkedlist.insert(i);
                    break;
                     
                case 2: 
                    System.out.println(buildlinkedlist.delete());
                    break;
                    
                case 3: 
                    if(buildlinkedlist.isEMpty())
                        System.out.println("YES EMPTY");
                    else
                        System.out.println("NOT EMPTY");
                    break;
                    
                    
                case 4: 
                    buildlinkedlist.display();
                    break;
            }
    }
    
}
}
