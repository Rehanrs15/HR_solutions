/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rehan r
 */
public class BuildLinkedList implements LLInterface{
    
    private Node head;
    private Node list1 = null,list2 = null;
    public BuildLinkedList(){
        head = null;
    }

    @Override
    public void insert(int element) {
    //stack
        Node tempNode = new Node();
        tempNode.info = element;
        tempNode.next = head;
        head = tempNode;
    }

    @Override
    public void delete() {
        
        if(isEmpty()){
            System.out.println("ListEmpty");
        }
        else{
            System.out.println("DELETED ELEMENT :"+head.info);
            head = head.next;
        }
        
    }

    @Override
    public void display() {
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.info+" ");
            tempNode = tempNode.next;
        }
        System.out.println("");
    }

    @Override
    public boolean isEmpty() {
        if(head == null)
            return true;
        else 
            return false;
    }

    @Override
    public void reverseList() {
      
        Node startPointer = head;
        int count = countNoOFItems();
        int[] reversedlist = new int[count];
        count = count-1;
        while(startPointer != null && count >=0 ){
            reversedlist[count]  = startPointer.info;
            startPointer = startPointer.next;
            count--;
        }
        
        System.out.println(Arrays.toString(reversedlist));
        
        
    }

    @Override
    public int countNoOFItems() {
    
        int count = 0;
        Node counterPointer = head;
        while(counterPointer != null){
            count++;
            counterPointer = counterPointer.next;
        }
        return count;
    
    }

    @Override
    public int deleteParticularIndexElement(int index) {
        Node start = head;
        Node previous = null;
        int element = -1;
        int i = 1;
        if(index == 0){
            element = start.info;
            head=head.next;
            start=head;
            display();
        }
        else{
            while(i <= index && start != null){
                previous = start;
                start = start.next;
                i++;
            } 
            element = start.info;
            previous.next=start.next;
            display();
        }
        return element;
        
    }

   

    @Override
    public void displayParticularList(Node list) {
        Node templist = list;
        while(templist != null){
            System.out.print(templist.info+" ");
            templist = templist.next;
        }
        System.out.println("");
        
    }

    @Override
    public void joinList() {
    
        Node list1 = head;
        Node list2 = head;
        displayParticularList(list1);
        displayParticularList(list2);
        Node p = list1;
        while(list1.next != null){
            list1=list1.next;
        }
        p.next = list2;
        System.out.println("Joined list:");
          while(p != null){
            System.out.print(p.info+" ");
            p = p.next;
        }
    }

     
    
    
}
