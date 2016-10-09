/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package preordertopost;

/**
 *
 * @author rehan r
 */
import java.util.*;
public class PreorderToPost {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    int array[] = {1,4,4,3,5,6,4,3,1,2,8,6,5};
    ArrayList l = new ArrayList();
    
        for (int i = 0; i < array.length; i++){
            if(!l.contains(array[i])){
                l.add(array[i]);
            }
            else{
                array[i] = 0;
            }
        }
        for (int i =0 ; i< array.length ; i++)
            System.out.print(array[i]+" ");
    }
}