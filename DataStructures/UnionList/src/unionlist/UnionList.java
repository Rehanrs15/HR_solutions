/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unionlist;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class UnionList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildList buildlinkedlist = new BuildList();
        Scanner in = new Scanner(System.in);
        System.out.println("press 0-toexit");
        while(true){
            System.out.println("1-insert, 2- union");
            int input = in.nextInt();
            switch(input){
                case 1:
                    System.out.print("enter the element :");
                    int i = in.nextInt();
                    
                    System.out.print("enter the list no :");
                    int j = in.nextInt();
                    
                    buildlinkedlist.insert(i,j);
                    break;
              
                    
                case 2:
                    buildlinkedlist.Union();
                    break;         
            }
        }
    }
    
}
