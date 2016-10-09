/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author rehan r
 */
public interface LLInterface {
    
    
    public void insert(int element);
    public void delete();
    public void display();
    public boolean isEmpty(); 
    public void reverseList();
    public int countNoOFItems();
    public int deleteParticularIndexElement(int index); 
    public void displayParticularList(Node list);
    public void joinList();
    
    
}
