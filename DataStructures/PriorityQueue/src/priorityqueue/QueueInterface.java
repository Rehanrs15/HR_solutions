/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqueue;

/**
 *
 * @author rehan r
 */
public interface QueueInterface {
    
    public void insert(int element,int priority);
    public void display();
    public boolean isEmpty();
    public int delete(int priority);
    
}
