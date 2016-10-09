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
public class BuildQueue implements QueueInterface{

    private int array[];
    private int front,rear;
    
    public BuildQueue(){
        array = new int[50];
        front = 0;
        rear = -1;
    }
    
    @Override
    public void insert(int element) {
        rear++;
        array[rear] = element;
    }

    @Override
    public int delete() {
        
        int remove = array[front];
        front++;
        return remove; 
        
    }

    @Override
    public void display() {
        if(isEmpty()){
            System.out.println("Queue Empty");
        }
        else{
            for(int i = front;i < array.length; i++){
                if(array[i] != 0)
                    System.out.print(array[i]+" ");
            }
            System.out.println("");
        }
    }

    @Override
    public boolean isEmpty() {
        
        if(rear < front)
            return true;
        else
            return false;
    }
    
}
