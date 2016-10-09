/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ll_insert_after;

import java.util.ArrayList;

/**
 *
 * @author rehan r
 */
public class BuildList {
    
    Node head;
     
    public BuildList(){
        head = null;
    }
    
    public void insert(int element){
        Node t = new Node();
        t.info = element;
        t.next = null;
        
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
    
    public int count(){
        Node q = head;
        int count = 0;
        while(q!=null){
            count++;
            q = q.next;
        }
        return count;
    }
    
    public void insertAfter(int element,int position){
        int count = count();
        Node t = new Node();
        t.info = element;
        t.next = null;
        if(count+1 < position || position < 0){
            System.out.println("enter a valid position");
        }
        else{
            if(position == 1){
                
                t.next = head;
                head=t;
                
            }else{
                int i = 2;
                Node p = head;
                while(i != position){
                    p = p.next;
                    i++;
                }
                t.next = p.next;
                p.next = t;
            }
        }
    }
    
    public void display(){
        Node p = head;
        while(p != null){
            System.out.print(p.info +" ");
            p = p.next;
        }
        System.out.println("");
    }
    
}
