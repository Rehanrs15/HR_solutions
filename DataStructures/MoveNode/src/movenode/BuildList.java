/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movenode;

/**
 *
 * @author rehan r
 */
public class BuildList {
 
    Node head;
    Node head1;
    public BuildList(){
        head = null;
        head1 = null;
    }
    
    public void insert(int ele){
        Node t = new Node();
        t.info = ele;
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
    
    public void Move(int nodeno,int position){
        Node p =head;
        Node q = null;
        int i = 1;
        
            while(i  < nodeno){
                q = p;
                p = p.next;
                i++;
            }
        q.next = p.next;
       
        
        
        int j = 1;
        Node h = head;
        while(j < (position - 2)){
            h = h.next;
            j++;
        }
        p.next = h.next;
        h.next = p;  
    }
    
    
    public void display(Node h){
        Node  u = h;
        while(u != null){
            System.out.print(u.info+" ");
            u = u.next;
        }
        System.out.println("");
    }
    
    public void Copy(){
        Node p = head;
        Node q = head1;
        while(p != null){
            Node t = new Node();
            t.info = p.info;
            t.next = null;
            if(head1 == null){
                head1 = t;
            }
            else{
                Node k = head1;
                while(k.next != null){
                    k = k.next;
                }
                k.next = t;
            }
            p = p.next;
        }
        System.out.println("LIST1");
        display(head);
        System.out.println("LIST2");
        display(head1);
        
    }
    
    public double Average(){
        Node p =head;
        int sum = 0;
        int count = 0;
        while(p != null){
            sum = sum + p.info;
            count++;
            p = p.next;
        }
        
        return sum/count;
    }
}
