/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polynomialsolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author rehan r
 */
public class Create {
    
    Node head1,head2;
    
    public Create(){
        head1 = null;
        head2 = null;
    }
    
    HashMap<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> hash2 = new HashMap<Integer,Integer>();
    void insert(int ele,int pow,int n){
        Node t = new Node();
            t.num = ele;
            t.exp = pow;
        t.next = null;
        if(n == 1){
            hash1.put(pow, ele);
            if(head1 == null){
                head1 = null;
            }
            else{
                Node p = head1;
                while(p.next != null)
                    p = p.next;
                p.next = t;
            }
        }
        else{
            hash2.put(pow, ele);
            if(head2 == null){
                head2 = null;
            }
            else{
                Node p = head2;
                while(p.next != null)
                    p = p.next;
                p.next = t;
            }
        }
    }
   
    
    void Solve(){
        for(int key : hash1.keySet()){
            if(hash2.containsKey(key)){
                System.out.print(hash1.get(key) + hash2.get(key)+"x^"+key+" ");
            }
            else{
                System.out.print(hash1.get(key)+"x^"+key+"  ");
            }
        }
        System.out.println("");
    }
    
    void Display(){
        System.out.println("EXP1 Exponent = "+hash1.keySet());
        System.out.println("EXP1 Coefficient = "+hash1.values());
        System.out.println("\n\nEXP2 Exponent = "+hash2.keySet());
        System.out.println("EXP2 Coefficient = "+hash2.values());
    }
}
