/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circularlist;

/**
 *
 * @author rehan r
 */
public class Circular {
    
    Node head;
    public Circular(){
        head = null;
    }
    
    public void insert(int element){
        
        Node t = new Node();
        t.info = element;
        t.next = null;
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
            System.out.print(p.info+" ");
            p = p.next;
        }
        System.out.print(p.info+"\n");
    }
    
    public void delete(){
        int ele = head.info;
        Node p = head;
        while(p.next != head){
            p = p.next;
        }
        p.next = head.next;
        head = head.next;
        
        System.out.println(ele);
    }
}
