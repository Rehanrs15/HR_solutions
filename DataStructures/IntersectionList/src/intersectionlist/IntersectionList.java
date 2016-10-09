/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intersectionlist;

import java.util.Scanner;

/**
 *
 * @author rehan r
 */
public class IntersectionList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         BuildList buildlinkedlist = new BuildList();
        Scanner in = new Scanner(System.in);
        System.out.println("press 0-toexit");
        while(true){
            System.out.println("1-insertList1 2-insertList2, 3- intersectionlist");
            int input = in.nextInt();
            
            switch(input){
                
                case 1:
                    System.out.print("enter the element:");
                    int ele = in.nextInt();
                    buildlinkedlist.insert1(ele);
                    break;
                    
                case 2:
                    System.out.print("enter the element:");
                    int ele1 = in.nextInt();
                    buildlinkedlist.insert2(ele1);
                    break;
                   
                case 3:
                    buildlinkedlist.intersectLists();
                    System.exit(0);
                    break;
            }
             
                    
    }
    
}
}
