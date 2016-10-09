/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circularlst;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class CircularLst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List l = new List();
        Scanner in = new Scanner(System.in);
        System.out.println("press 0-toexit");
        while(true){
            System.out.println("1-insert, 2 -display");
            int input = in.nextInt();
            switch(input){
                 case 1:
                    System.out.print("enter the element :");
                    int i = in.nextInt();
                    l.insert(i);
                    break;
                     
                case 2: 
                    l.display();
                    break;
            }
    }

    }
    
}
