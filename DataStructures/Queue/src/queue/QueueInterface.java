/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

/**
 *
 * @author rehan r
 */
public interface QueueInterface {
    
    public void insert(int element);
    public int delete();
    public void display();
    public boolean isEmpty();
    
}
