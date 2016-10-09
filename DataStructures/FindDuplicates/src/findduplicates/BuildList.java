/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package findduplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author rehan r
 */
public class BuildList {
    
    HashMap hashmap = new HashMap();
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
    public void display(){
        Node p = head;
        while( p != null){
            System.out.print(p.info+" ");
            p = p.next;
        }
        System.out.println("");
    }
    
    public void FIndRepetation(){
        
        Node p =head;
        while(p != null){
            int count = 0;
            if(hashmap.keySet().contains(p.info)){
                int c = (int) hashmap.get(p.info);//can tell here also that number is repeated;
                c++;
                hashmap.put(p.info, c);
            }
            else{
                count++;
                hashmap.put(p.info, count);
            }  
            p = p.next;
        }
        System.out.println(hashmap);
    }
    
    public void isDuplicatePresent(){
        FIndRepetation();
        int i = 1;
        int flag = 0;
        for(Object hm : hashmap.keySet()){
            if(hashmap.get(hm).equals(i)){
            continue;
            }
            else{
                flag = 1;
                break;
            }
        }
        
        if(flag == 1){
            System.out.println("YES DUPLICATE PRESENT");
        }
        else{
            System.out.println("NO DUPLICATE NOT PRESENT");
        }
    }
}
