/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deletealternate;

/**
 *
 * @author rehan r
 */
public class BuildList {
    
    Node head;
    public BuildList(){
        head = null;
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
    
    public void DeleteAlternate(){
        int size = count();
        System.out.println("count"+size);
        int i = 1;
        Node p = head;
        Node q = null;
        while(i <= size && p.next != null){
            if(i%2 == 0 ){
                q = p;
                p = p.next.next;
                q.next = p;
                i++;
            }
            i++;
        }
        
        display();
        
    }

    private int count() {
            Node p = head;
            int count = 0;
            while(p != null){
                count++;
                p = p.next;
            }    
            return count;
    }

    private void display() {
      
            Node p = head; 
            while(p != null){
                System.out.print(p.info+" ");
                p = p.next;
            } 
            System.out.println("");
    
    }
    
}
