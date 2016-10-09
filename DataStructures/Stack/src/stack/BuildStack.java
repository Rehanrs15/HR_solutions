/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * @author rehan r
 */
public class BuildStack implements StackInterface{

    
    private int top;
    private int[] array;
    
    public BuildStack(){
        top = -1;
        array = new int[50];
    }
    
    @Override
    public void push(int element) { 
        top++;
        array[top] = element;
    }

    @Override
    public int pop() {
        int delete = array[top];
        top--;
        return delete;
    }

    @Override
    public void display(){
            
        for(int i = 0;i<= top;i++){
            if(array[i] != 0)
                System.out.print(array[i]+" ");
        }
         System.out.println("");
    }

    @Override
    public int isEmpty() {
    
        if(top == -1)
            return 1;
        else
            return 0;
    }
    
    
    
}
