/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylist;

/**
 *
 * @author rehan r
 */
public class PrimitiveOperations {
    
    public void insert(int ele){};
    
    public int delete(){ return 1; };
    
    public void display(Node h){
    
        Node p = h;
        while(p != null){
           System.out.print(p.info+" ");
           p = p.next;
        }
        System.out.println("");
    
    } 
    
    public boolean isEMpty(){ return true; };
    
}
