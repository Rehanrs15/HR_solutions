/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intersectionlist;

import java.util.ArrayList;

/**
 *
 * @author rehan r
 */
public class BuildList {
    
    
    Node head1;
    Node head2;
    Node IntersectionList;
    ArrayList l1 = new ArrayList();
    ArrayList l2 = new ArrayList();
    
    public BuildList(){
     
        head1 =null;
        head2 = null;
        IntersectionList = null;
    }
    
    public void insert1(int ele){
        Node t = new Node();
        t.info = ele;
        t.next = null;
        
        if(head1 ==null){
            head1 = t;
        }
        else{
            Node p = head1;
            while(p.next != null){
                p = p.next;
            }
            p.next = t;
        }
    }
    
    
    public void insert2(int ele){
        Node t = new Node();
        t.info = ele;
        t.next = null;
        
        if(head2 ==null){
            head2 = t;
        }
        else{
            Node p = head2;
            while(p.next != null){
                p = p.next;
            }
            p.next = t;
        }
    }
    
    public void insertintoArrayList(){
        
        Node p = head1;
        while(p!=null){
            if(!l1.contains(p.info))
                l1.add(p.info);
            p = p.next;
        }
        
        Node q = head2;
        while(q!=null){
            if(!l2.contains(q.info))
                l2.add(q.info);
            q = q.next;
        } 
        
        
         System.out.println(l1+" "+l2);
        
    }
    
    public void intersectLists(){
        insertintoArrayList();
        
        int i1 = l1.size();
        int i2 = l2.size();
        if(i1 < i2){
            l2tol1();
        }
        else{
            l1tol2();
        }
        display();
    }
    
    
    
    public void display(){
        System.out.println("intersection List");
        Node p =IntersectionList;
        while(p != null){
            System.out.print(p.info+" ");
            p = p.next;
        }
         System.out.println("");
    }

    private void l2tol1() {
    int i = 0;   
    while(i < l1.size()){
           Node t = new Node();
            if(l2.contains(l1.get(i))){
                t.info = (int)l1.get(i);
                t.next = null;
                if(IntersectionList ==null){
                     IntersectionList = t;
                }
                else{
                    Node p = IntersectionList;
                    while(p.next != null){
                        p = p.next;
                    }
                    p.next = t;
                }   
            }
            i++;
        }
    
    }

    private void l1tol2() {
    int i = 0;   
    while(i < l2.size()){
           Node t = new Node();
            if(l1.contains(l2.get(i))){
                t.info = (int)l2.get(i);
                t.next = null;
                if(IntersectionList ==null){
                     IntersectionList = t;
                }
                else{
                    Node p = IntersectionList;
                    while(p.next != null){
                        p = p.next;
                    }
                    p.next = t;
                }   
            }
            i++;
        }
    }
    
        
}
    
    

