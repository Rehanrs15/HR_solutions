/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prioritylist;

/**
 *
 * @author rehan r
 */
public class BuildList {
 
    public Node head;
    
    public BuildList(){
        head = null;
    }
    
    public void insert(int element, int priority){
        Node t = new Node();
        t.info = element;
        t.priority = priority;
        t.next = null;
        
        if(priority > (count()+1) || priority < 0){
            System.out.println("enter a valid priority");
        }
        else{
            if(head == null){
                head = t;
            }
            else{
                Node p = head;
                while(p.next != null){
                    p = p.next;
                }
                p.next = t;
            }
        }
    }
    
    public int count(){
        int count = 0;
        Node p = head;
        while(p != null){
            count++;
            p = p.next;
        }
        return count;
    }
    
    public void display(){
        Node p = head;
        while(p != null){
            System.out.println(p.info+" "+ p.priority);
        }
    }
    
    
    
    
}
