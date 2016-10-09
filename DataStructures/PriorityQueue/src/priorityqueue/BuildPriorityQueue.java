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
public class BuildPriorityQueue implements QueueInterface{

    private int[] array;
    private int[] priorityArray;
    int front,rear;
    
    public BuildPriorityQueue(){
        
        front = 0;
        rear = -1;
        array = new int[10];
        priorityArray = new int[10];
    }
    
    @Override
    public void insert(int element,int priority) {
        
        rear++;
        array[rear] = element;
        priorityArray[rear] = priority;
        
    }

    @Override
    public void display() {
        
        System.out.println("Element, Priority");
        for(int i = front; i< array.length; i++){
            if(array[i] != 0)
                System.out.println(array[i]+","+priorityArray[i]);
        }
        
    }

    @Override
    public boolean isEmpty() {
        if(rear < front)
            return true;
        else
            return false;
    }

    @Override
    public int delete(int priority) {
        int found = 0;
        for(int i = front;i<priorityArray.length;i++){
            if(priority != priorityArray[i])
                found++;
        }
        found = priorityArray.length - found-1; 
        
        int remove = array[found];
        for(int j = found; j< rear; j++){
                array[j] = array[j+1];
                priorityArray[j] = priorityArray[j+1];  
        }
        
    return remove;
    }
    
}
