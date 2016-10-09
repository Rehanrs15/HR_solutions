/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylist;

/**
 *
 * @author rehan r
 */
public class ListBuilder extends PrimitiveOperations {
    
    Node head;
    public ListBuilder(){
        head = null;
    }
    
    @Override
    public void insert(int ele){
        Node t = new Node();
        t.info = ele;
        t.next = null;
        t.pre = null;
        if(head == null){
            head = t;
        }
        else{
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = t;
            t.pre = p;
        }
    }
    
    
    @Override
    public boolean isEMpty(){
            if(head == null)
                return true;
            else
                return false;
    }
     
    @Override
    public int delete(){
        
        int ret = head.info;
        head = head.next;
        return ret;
        
    }
    
    
    public void display(){
        super.display(head);
    }
    
}
