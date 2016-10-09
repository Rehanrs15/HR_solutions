/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circularlst;

/**
 *
 * @author rehan r
 */
public class List {
    
    Node head;
    public List(){
        head = null;
    }
    
    public void insert(int ele){
        
        Node t = new Node();
        t.ele = ele;
        t.next = t;
        
        if(head == null){
            head = t;
            head.next = head;
        }
        else{
            Node p = head;
            while(p.next != head){
                p = p.next;
            }
            p.next = t;
            t.next = head;
        }
    }
    
    
    public void display(){
        Node p = head;
        while(p.next != head){
            System.out.print(p.ele+" ");
            p = p.next;
        }
            System.out.println(p.ele);
    }
}
