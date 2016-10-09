/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unionlist;

import java.util.ArrayList;

/**
 *
 * @author rehan r
 */
public class BuildList {
    
    Node head1;
    Node head2;
    Node unionList;
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    public BuildList(){
        head1 = null;
        head2 = null;
        unionList = null;
    }
    
    public void insert(int element,int listno){
      
        switch(listno){
            
            case 1:
               if(!arrayList1.contains(element)){
                    insertToParticularList(head1,element);
                    arrayList1.add(element);
               }
               break;
                
            case 2:  
               if(!arrayList2.contains(element)){
                    insertToParticularList(head2,element);
                    arrayList2.add(element);
               }
                break;
                
        }
        
    }
    
    
    private void insertToParticularList(Node head, int element) {
    
        Node temp = new Node();
        temp.info = element;
        temp.next = null;
       
         if(head == null){
                    head = temp;
                    head.next = null;
                }
                else{
                    Node p = head;
                    while(p.next != null){
                        p = p.next;
                    }
                    p.next = temp;
                }
    }
    
 

    private void displayParticularlist(Node head) {
     
        System.out.println("UNIONLIST");
        if(head == null){
            System.out.println("tre");
        }
        Node p = head;
        while(p != null){
            System.out.print(p.info +" ");
            p = p.next;
        }
        System.out.println("");
    
    }
    
    public void Union(){
        
        unionMergeArrayList();
        for(int j = 0;j<arrayList1.size();j++){
            Node t = new Node();
            t.info = (int) arrayList1.get(j);
            t.next = null;
            if(unionList == null){
                unionList = t;
            }
            else{
                Node p = unionList;
                while(p.next != null){
                    p = p.next;
                }
                p.next = t;
            }
            
        }
        displayParticularlist(unionList);
        
    }

    private void unionMergeArrayList() {
        
        for(int i = 0;i<arrayList2.size();i++){
            if(!arrayList1.contains(arrayList2.get(i))){
                arrayList1.add(arrayList2.get(i));
            }
        } 
    
    }

    
}
